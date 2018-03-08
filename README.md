# MiniJavaParser

a parser for MiniJava program

## Background

MiniJava appears in *Modern Compiler Implementation in Java (Second Edition)*. More details can be found [here](http://www.cambridge.org/resources/052182060X/MCIIJ2e/). The parser is amended from the files in [here](http://www.cambridge.org/resources/052182060X/
).

## Reference

The grammar follows from this [reference](http://www.cs.tufts.edu/~sguyer/classes/comp181-2006/minijava.html), which is a mirror copy of the respective section from the textbook, with the following exception:

* Integer literals can be in octal, decimal, and hexadecimal formats. Specifically, it follows the respective definitions of integer literals from the [Java documentation](https://docs.oracle.com/javase/specs/jls/se7/html/jls-3.html#jls-3.10.1) except that underscore is not allowed.

* Additional operators: `||`, `/`, `-`(unary), `^^`

* Additional structure: `for` loop

## Usage

Run `Makefile` with the `make` command.

* rules
  * all: compile all necessary files
  * clean: remove binary files (*.class)
  * test1: parse each files in `input`
  * test2: pretty print each files in `input`
  * test3: translate each files in `input` into Java, compile them and run them

You can also run `java Main`, `java Main2`, `java Main3` to parse, pretty print and translate into Java.

## Appendix

**Precedence and Associativity Table**

* Name: [A-Z] (from high precedence to low prec)
* L: left associative
* R: right associative

Name | Associativity | Operators
:---: | :---: | ---
A | L | `[]`, `.`
B | R | `-`(unary), `!`
C | R | `^^`
D | L | `*`, `/`
E | L | `+`, `-`
F | L | `<`
G | L | `&&`
H | L | `\|\|`
