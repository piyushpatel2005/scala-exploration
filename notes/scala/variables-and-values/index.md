# Scala Values, Variables and Operators

Now that you're familiar with how to write and run your test codes in Scala, let's dive into the basic syntax of Scala programming language.

## Scala Values and Variables

In Scala, just like any other language, we have concept of variables which are named memory locations to store values. The variable declaration looks like this.

```scala
keyword variableName: DataType = value
```

The `val` keyword is used to declare what's also called values in Scala. The value of a `val` cannot be changed once it is assigned. While declaring a value, you can either explicitly specify the data type or let the Scala compiler infer the type for you.

```scala
val aVal: Int = 20
val anotherVal = 20
val aString: String = "Hello"
//aVal = 200 // Not Ok
```

You can declare variables which are mutable using `var` keyword. Unlike value types, these variables can be re-assigned and their values can change. Again, you can either be explicit in your type definition or let Scala infer the type for you.

```scala
var aVar: Int = 10
var anotherVar = 10
aVar = 15 // This is allowed
```

One more interesting bit is that, you can omit the type of the variable and Scala will infer the type of the variable based on the value assigned to it. This is called type inference.

```scala
val x = 10 // x is of type Int
val y = "Hello" // y is of type String
```

In functional programming, it is recommended to use `val` as much as possible to avoid side effects. This makes your code more predictable and easier to reason about as no other function can change the assigned value.

If you try to change the value of `val`, you will get a compilation error.

### Scala Comments

In Scala, you've both single line and multi-line comments. Single line comments start with `//` and multi-line comments are enclosed in `/*` and `*/` just like Java.

```scala
// This is a single line comment
println("Hello World")

/* This is a multi-line comment
   This is second line of comment */
```

As you can see above, you can print the variables or values using `println` function. This function is similar to `System.out.println` in Java. You could also use functions like `print` or `printf` to print the values.

- `print`: This can be used to print anything to the console without a newline character at the end.
- `println`: This can be used to print anything just like `print` method but it puts a new line character at the end of each output.
- `printf`: This can be used to print formatted strings to the console. It is similar to `printf` in C language.

```scala
val name = "Akbar"
print("Hello " + name)
println() // prints new line after print
println("Hello " + name)
printf("Hello %s\n", name)
```

### Scala Semicolons

In Scala, semicolons are optional. You can write multiple statements in a single line separated by semicolons or write each statement in a new line. So, if you're following best practices, you can avoid using semicolons. Usually, you will not write more than one statement in a single line which means you will not need to add semicolon at the end of each statement.

```scala
println("Hello World")
println("Hello Scala")
```

## Data Types

Scala has a rich set of data types that you can use in your programs. It has all the built-in types of Java language.

```scala
val anInt: Int = 20
val aLong: Long = 20L
val aFloat: Float = 20.0f
val aDouble: Double = 20.0
val aChar: Char = 'a'
val aString: String = "Hello"
val aBoolean: Boolean = true
```

Scala also has rich collections library which contains similar collections as Java. You will learn about collections in upcoming lessons. Notice that you don't need the `new` keyword to create these collections unlike Java.

```scala
val aList = List(1, 2, 3)
val aMap = Map("one" -> 1, "two" -> 2, "three" -> 3)
val anArray = Array(1, 2, 3)
```

## Scala Operators

Scala supports all the operators that are available in Java. If you're coming from other languages, this might be similar to other language except few new ones or missing ones. Here are some of the operators that you can use in Scala.

- Arithmetic Operators: `+`, `-`, `*`, `/`, `%`
- Relational Operators: `==`, `!=`, `>`, `<`, `>=`, `<=`
- Logical Operators: `&&`, `||`, `!`
- Bitwise Operators: `&`, `|`, `^`, `~`, `<<`, `>>`, `>>>`
- Assignment Operators: `=`, `+=`, `-=`, `*=`, `/=`, `%=`
- Increment/Decrement Operators: `++`, `--`
- Ternary Operator: `? :`
- String concatenation: `+`

```scala
val a = 10
val b = 20
val sum = a + b
val diff = a - b
val mul = a * b
val div = a / b
val mod = a % b

val isEqual = a == b
val isNotEqual = a != b
val isGreater = a > b
val isLess = a < b
val isGreaterOrEqual = a >= b
val isLessOrEqual = a <= b

val and = a > 5 && b < 30
val or = a > 5 || b < 30
val not = !(a > 5)

val bitwiseAnd = a & b
val bitwiseOr = a | b
val bitwiseXor = a ^ b
```
