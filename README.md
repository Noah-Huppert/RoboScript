#RoboScript
RoboScript is a basic scripting language that is meant to control Robocode robots.  

#Usage
- Write a script and save in text file
 - Have at least a main method
 - You can define other methods for the event handlers
- Use in robot
 - Make your robot extend RoboScriptRobot
   - In constructor create new RoboScript object
    - This will load the script contents
    - Compiles the script
    - Saves the AST
   - Call super with this RoboScript object
    - The robot will then execute the correct methods


#Compiler Process
- Retrieve RoboScript contents
- Lexer
 - Convert keywords into tokens
 - Make list of expressions
  - Each expression is terminated by EXPRESSION_END
- Parser
 - Look for patterns in tokens
 - Convert patterns into ASTExpressions
- Executor
 - Run AST

#Compiler Classes
Assume all fields are private and getters and setters are written for each field
- Location
 - Used for storing the location of a token.
 - Fields
  - int line
  - int column
- Token
 - What keywords are converted into
 - Fields
  - TokenType type
   - The type of the token, one of the Tokens described below
  - String characters
   - The actual characters that made the lexer think it was this type of token
  - Location location
   - The location of the token in the code
   - This will be used later on in error reporting
- Expression
 - A series of tokens
 - Fields
  - List<Token> tokens
   - The tokens in the expression
    - The EXPRESSION_LIMITER is included in this list
- ExpressionBlock
 - A series of Expressions
 - Fields
  - List<Expression> expressions
   - The expressions in the ExpressionBlock
- Type<DataClass>
 - The type of a variable
 - Fields
  - VariableType type;
  - Class<DataClass> dataClass
- Variable<DataClass>
 - A variable
 - Fields
  - String id
   - The id of the variable
  - ASTType type
   - The type of the variable
  - Methods
   - <DataClass> getData()
    - Gets the data
- Function
 - Runs an ASTExpression
 - Fields
  - Type returnType
  - String id
  - ASTExpression expressions
- Namespace
 - Stores identifiers
 - Fields
  - Namespace parent
   - The parent namespace
  - List<Variable> variables
  - List<Function> functions
- ASTExpression
 - A Expression converted into a runnable piece of code
 - Methods
  - void execute(Namespace namespace)

#Specification
##Lexicon
- Scope
 - Describes what parts of the program can access the object in question.
 - EX: `public` or `private`
- Type
 - Describes the data structure to store the data in.
 - EX: `int` or `float`
- Identifier
 - Points to the name of a function or variable
- Literal
 - A piece data that has a type
 - EX: `1` or `"foo"`
- Operator
 - Performs an operation on the tokens to the right and left of it
 - EX: `+` or `-`
- Assignment Operator
 - An operator that assigns an object a value
 - EX: `=` or `+=`
- Boolean Operator
 - An operator that returns a boolean value
 - EX: `>` or `==`
- Options
 - The area of a function declaration or call where options go
 - EX: `(5, 1, "Foo")`
- Conditional
 - A Expression block that will either run or not run based on a condition
 - EX: `if` or `else`
- Reserved Identifier
 - A word that signifies a special code block or type
 - EX: `class` or `array`
- Expression
 - The simplest part of the program that can be run by itself
 - ie A line of the program
- Expression Block
 - A series of expressions

##Structure
Every file is broken up into several parts. These parts create a "tree".  
At the highest level there is the global expression block. Every part of the program belongs to this expression block.  
Inside this expression block there are a numerous expressions. The end of an expression is noted by the appearance of a
`EXPRESSION_BLOCK_END` token. Some expressions can have expression blocks in them, like if statements.  

##Tokens
- SCOPE
- IDENTIFIER
- TYPE
- LITERAL
- LITERAL_DELIMETER
- OPERATOR
- ASSIGNMENT_OPERATOR
- BOOLEAN_OPERATOR
- CONDITIONAL
- RESERVED_IDENTIFIER
- OPTIONS_START
- OPTIONS_END
- EXPRESSION_END
- EXPRESSION_BLOCK_START
- EXPRESSION_BLOCK_END

##Scopes
- PUBLIC
 - Keyword: `public`
 - Can be accessed by anything
- PRIVATE
 - Keyword: `private`
 - Can only be accessed by the object who owns the expression block

##Types
- INTEGER
 - Keyword: `int`
 - A standard `int` in java
- FLOAT
 - Keyword: `float`
 - A standard `float in java
- BOOLEAN
 - Keyword: `boolean`
 - Has the value of `true` or `false`
- CHARACTER
 - Keyword: `char`
 - A single character
- STRING
 - Keyword: `string`
 - An array of characters

##Literals
Each type has a literal. They are identified by the followed
- INTEGER
 - A number with no decimal places
- FLOAT
 - A number with decimal places
- BOOLEAN
 - The word `true` or `false`
- CHARACTER
 - One character
- STRING
 - A series of characters

##Literal Delimiters
- CHARACTER
 - Keyword: `'`
- STRING
 - Keyword: `"`

##Operators
Operators each have left side and a right side. The template for using a operator is:  
`<left side> <operator> <right side>`  
The `left side` and `right side` can abbreviated to:  

> `left side` = `ls`
> `right side` = `rs`

- ADD
 - Keyword: `+`
 - Adds the `ls` to the `rs`
- SUBTRACT
 - Keyword: `-`
 - Subtracts the `rs` from the `ls`
- MULTIPLY
 - Keyword: `*`
 - Multiplies the `ls` times the `rs`
- DIVIDE
 - Keyword: `/`
 - Divides the `ls` by the `rs`

##Assignment Operators
Operators each have left side and a right side. The template for using a operator is:  
`<left side> <operator> <right side>`  
The `left side` and `right side` can abbreviated to:  

> `left side` = `ls`
> `right side` = `rs`

- EQUAL
 - Keyword: `=`
 - Sets the `ls` equal to the `rs`
- ADD_EQUAL
 - Keyword: `+=`
 - Sets the `ls` equal to `ls` plus `rs`
- SUBTRACT_EQUAL
 - Keyword: `-=`
 - Sets the `ls` equal to `ls` minus `rs`
- MULTIPLY_EQUAL
 - Keyword: `*=`
 - Sets the `ls` equal to `ls` times `rs`
- DIVIDE_EQUAL
 - Keyword: `/=`
 - Sets the `ls` equal to `ls` divided by `rs`

##Boolean Operators
Operators each have left side and a right side. The template for using a operator is:
`<left side> <operator> <right side>`
The `left side` and `right side` can abbreviated to:

> `left side` = `ls`
> `right side` = `rs`

- GREATER
 - Keyword: `>`
 - Returns weather or not `ls` is greater than `rs`
- LESS
 - Keyword: `<`
 - Returns weather or not `ls` is less than `rs`
- EQUAL
 - Keyword: `==`
 - Returns weather or not `ls` is equal to `rs`

##Conditionals
A conditional must have a condition and a code block to run if the conditional is true. Here is a template for using a
conditional:  
`CONDITIONAL (condition) { <expression block> }`
- IF
 - Keyword: `if`
 - Runs the expression block if the condition is true
- ELSE
 - Keyword: `else`
 - Runs the expression block if the previous conditional is false
- ELSE_IF
 - Keyword: IF followed by ELSE
 - Runs the expression block if the previous conditional is false and its condition is true

##Reserved Identifiers
- ARRAY
 - Keyword: `array`
 - Signifies that the following identifier is is an array
 - Template: `<scope> <type> ARRAY <identifier>`