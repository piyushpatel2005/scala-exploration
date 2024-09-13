# Scala If Expressions and Functions

This tutorial covers idea of functional programming in Scala. For this, it also covers expressions and functions in Scala which are building blocks of any functional language.

## Scala `If-Else` Expression

In Scala, you can also use `if-else` expressions to write conditional logic. You can use `if-else` as an expression which means it will return a value. This is similar to ternary operator in Java.

```scala
val x = 10
val y = 20
val result = if (x > y) x else y
println(result) // 20
```

You can also write more complicated `if-else` expressions by using `else if` condition. However, if it's getting too complicated, you could use other constructs like `match` expression which will be covered later.

```scala
val max2 = if (x > y) x else if (x < y) y else 0
```

## Functions

In Mathematics, functions will always yield the same result for the same set of input. This is called referential transparency. Also, you can compose new functions by combining existing functions. This way you can build complex functions from simple functions.

### Syntax

In Scala, functions are first class citizens. You can define a function using `def` keyword. You can call the function by using parenthesis after the function name. The syntax for definining function looks like this.

```scala
def functionName(param1: Type, param2: Type): ReturnType = {
  // Function body
}
functionName(param1, param2)
```

### Example

Let's see few examples of defining simple functions and calling those functions.

In Scala, functions are supposed to be very simple and concise to make the code more readable. Also notice that in Scala, you don't need to write `return` statement at the end of the function to return some value. It's because Scala will return the last expression in the function body. You could use `return` statement if you want but it's not necessary unless you want to return early from the function based on some condition.

```scala
def add(a: Int, b: Int): Int = {
  a + b
}

def subtract(a: Int, b: Int): Int = {
  a - b
}

val additionResult = add(10, 20)
val subtractionResult = subtract(20, 10)
println(additionResult) // 30
println(subtractionResult) // 10
```

No matter how many times you apply the function `add` on same set of input, you will always get the same result. This ifunction does not modify any of the input parameters. That is this function does not have any *side effects*. This is one of the core principles of functional programming. In imperative programming, you would rather declare a variable and then modify it's value based on some condition. This is not recommended in functional programming.

A function which is referentially transparent is called a *pure function*. Pure functions are easy to test and reason about. They are also easier to parallelize and optimize in distributed computing. You can simply replace pure functions with their results without changing the behavior of the program. In order to create referentially transparent functions, you should use data structures that are immutable.

Even collection types like `List` should not be modified. If you want to modify them, you should create a new collection with the modified values. Since these collections are immutable, you can safely share them across threads without any worries. This is one of the reasons why Scala is popular in distributed computing.

### Type Inference in Functions

Just like values or variables, you can let Scala infer the type of the function return type. 

```scala
def add(a: Int, b: Int) = {
  a + b
}
```

In this case, you've ignored explicit return type of the function and yet Scala compiler will figure out the return type of the function based on the return value of the function. 

> **Note:** It's usually better to be explicit about the return type of the function to make the code more readable.

### Functions with Single Expression

If your function is small and can fit as a single expression, you can omit curly braces for the function body. This is quite common in Scala.

```scala
def perimeter(width: Int, height: Int): Int = width * 2 + height * 2
```

### Functions with No Return Value

If your function does not return any value, you can specify the return type as `Unit`. This is similar to `void` in Java.

```scala
def introduce(name: String): Unit = println("Hello, my name is " + name)
introduce("Javed") // Hello, my name is Javed
```

### Functions with Default Parameters

You can also define functions with default values for parameters. This is useful when you want to provide default values for parameters. The default arguments always have to be the last arguments in the function definition.

```scala
def add(a: Int, b: Int = 10): Int = a + b
val result = add(10)
println(result) // 20
```

