# String Interpolation

Scala provides a feature called string interpolation that allows you to embed expressions within string literals, 
using the `s`, `f`, and `raw` interpolators. These three interpolators are used for different purposes as you will 
see in this lesson.

## `s` Interpolator

The `s` interpolator is used to embed expressions within a string. It is the most commonly used string interpolator. 
You 
can use `${}` to 
embed expressions within a 
string. If the variable name is easy to infer then you could also use `$variableName` syntax. These expressions are 
evaluated and 
the result is 
concatenated with the string. 

```scala
val name = "Jacob"
val city = "New York"
val message = s"Hello, I'm $name. I live in $city."
println(message) // Hello, I'm Jacob. I live in New York.
```

You might wonder when to use `${}` syntax. You should use `${}` syntax when you want to include complex expressions.

```scala
val name = "Jacob"
val city = "New York"
val message = s"Hello, I'm ${name.toUpperCase}. I live in ${city.toLowerCase}."
println(message) // Hello, I'm JACOB. I live in new york.
```

Another instance when you may need this syntax is when Scala compiler cannot infer the variable name. For instance,

```scala
val fruit = "apple"
// println(s"A basket of $fruits") // Error
println(s"A basket of ${fruit}s")
```

## `f` Interpolator

The `f` interpolator is used to format numbers. You can use `%d` for integers, `%f` for floating-point numbers, and 
`%s`. This will provide you with the ability to format the numbers as you want like C-style `printf` function.

```scala
val amount = 123.456
println(s"You owe me $amount") // You owe me 123.456
println(f"You owe me $amount%.2f$$") // You owe me 123.46$
```

In above example, the normal `s` interpolator will not format the number. But the `f` interpolator will format the 
number based on the format specifier. Also notice that, in order to use `$` in the string, you need to escape it with 
`$$`.

Another interesting feature of `f` interpolator is that it will throw a compile-time error if the format specifier 
is of the wrong type compared to the variable data type.

```scala
val amount = 123.456
println(f"You owe me $amount%d$$") // Error: type mismatch; found : Double required: Int
```

## `raw` Interpolator

The `raw` interpolator can be used to avoid escaping characters in a string. It is useful when you want to include 
characters like `\n` or `$` in a string.

```scala
println(raw"Hello\tWorld") // Hello\tWorld
```