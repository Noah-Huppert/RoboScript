#RoboScript
RoboScript is a basic scripting language that is meant to control Robocode robots.  

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
- Options
 - The area of a function declaration or call where options go
 - EX: `(5, 1, "Foo")`
- Conditional
 - A Expression block that will either run or not run based on a condition
 - EX: `if` or `e`ls`e`
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
- OPERATOR
- ASSIGNMENT_OPERATOR
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
 - Has the value of `true` or `fa`ls`e`
- CHARACTER
 - Keyword: `char`
 - A single character
- STRING
 - Keyword: `string`
 - An array of characters

##Litera`ls`
Each type has a literal. They are identified by the followed
- INTEGER
 - A number with no decimal places
- FLOAT
 - A number with decimal places
- BOOLEAN
 - The word `true` or `fa`ls`e`
- CHARACTER
 - One character
- STRING
 - A series of characters
 
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
- CLASS
 - Keyword: `class`
 - Signifies that the following expression follows a class creation template
 - Template: `<scope> CLASS <identifier>(<arguments>){ <expression block> }
- ARRAY
 - Keyword: `array`
 - Signifies that the following identifier is is an array
 - Template: `<scope> <type> ARRAY <identifier>`