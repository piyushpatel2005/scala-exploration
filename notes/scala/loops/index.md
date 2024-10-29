# Scala Loops

Loops are used to execute a block of code multiple times. Scala has traditional `while` and `do...while` loops similar to other programming languages. It also has a lot more powerful `for` loop which can be used to iterate over collections.

## While Loop

`while` loop is used to execute a block of code as long as the condition is true.

```scala
var i = 0
while (i < 5) {
  println(i)
  i += 1
}
```

## Do While Loop

There used to be `do...while` loop in Scala 2 which is dropped in Scala 3. It is used to execute a block of code at least once and then repeatedly execute it as long as the condition is true.

```scala
var i = 0
do {
  println(i)
  i += 1
} while (i < 5)
```

## For Loop

`for` loop is used to iterate over a collection of items. You can use `for` loop to iterate over a range of numbers, a collection, or any other sequence.

Scala also provides convenient way to iterate over a range of numbers using `to` and `until` methods. These are methods but for now you can think of them as keywords. I will explain more about these methods in upcoming lessons.

```scala
for (i <- 1 to 5) {
  println(i)
}
```

Using `until` method instead of `to` will exclude the upper bound.

```scala
for (i <- 1 until 5) {
  println(i)
}
```

You can also iterate over a range of numbers with a step.

```scala
for (i <- 1 to 10 by 2) {
  println(i)
}
```

You can also iterate over a collection using `for` loop.

```scala
val names = List("John", "Johny", "Jane")
for (name <- names) {
  println(name)
}
```