#RoboScript
RoboScript's syntax is very similar to Ruby. Each line should only one function each. Arguments can be added to these
functions after the function name. These arguments are delineated via spaces. Currently RoboScript does not support
custom functions or variables. The only functions that can be used are the global RoboScript functions defined by the
compiler. The only data type in RoboScript is a double. This is because the functions defined by the compiler only take
doubles. 

#Proccess
- Load file contents
- Parse for tokens
- Built AST

#Token Classes
- Token
 - enum tokenType
 - String id
- Variable<DataType>
 - enum varType
 - <DataType> data
- Function
 - ArrayList<Variable> args
 
#Token Types
- variable
- function

#Variable Types
- double