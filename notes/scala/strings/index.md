# Strings

Strings in Scala are similar to Java strings. They are immutable and can be concatenated using the `+` operator. 
Scala also has a rich set of methods available on strings. Just like Java, Strings are instances of `java.lang.
String` class. They are interned, which means that two strings with the same value will refer to the same object in memory.

## Creating Strings

Strings can be created as a literal or by using the `String` class. Here are a few examples:

```scala
val str1 = "Hello, World!"
val str2 = new String("Hello, World!")
```

In Java, you had to use `+` operator to concatenate strings. In Scala, you can use triple quotes to write multi-line 
strings.

```scala
val str3 = """This is a multi-line
string"""
```

If your string contains extra margins, you can use `stripMargin` method to remove them.

```scala
val str4 = """|This is a multi-line
              |string""".stripMargin
println(str4)
```

Two strings can  be concatenated using the `+` operator:

```scala
val str1 = "Hello"
val str2 = "World"
val str3 = str1 + ", " + str2 + "!"
```

## String Methods

Strings has wide range of methods to make working with strings easier.

- You can use `length` method to get the length of the string.

```scala
val str = "Hello, World!"
println(str.length) // 13
```

- You can use `toUpperCase` and `toLowerCase` methods to convert the string to upper case and lower case respectively.

```scala
"Hello World".toUpperCase() // HELLO WORLD
"Hello World".toLowerCase() // hello world
```

- You can use `charAt` method to get the character at a specific index.

```scala
val str = "Hello, World!"
println(str.charAt(0)) // H
```

- You can use `substring` method to get a substring from the original string.

```scala
println("Hello, World".substring(0, 5)) // Hello
```

- You can use `split` method to split the string based on a delimiter. The `split` method takes a regular expression 
  as an argument and returns an array of strings based on the delimiter.

```scala
val str = "Hello, World!"
val parts = str.split(", ")
println(parts(0)) // Hello
println(parts(1)) // World!
```

- You can use `startsWith` and `endsWith` methods to check if a string starts or ends with a specific substring. 
  These are case sensitive.

```scala
"Hello World".startsWith("Hello") // true
"Hello World".endsWith("world") // false
```

- You can use `contains` method to check if a string contains a specific substring.

```scala
"Hello World".contains("World") // true
```

- You can use `indexOf` and `lastIndexOf` methods to find the index of a specific substring. `indexOf` returns the 
  first occurrence of the substring and `lastIndexOf` returns the last occurrence of the substring. These methods 
  also take optional second argument to specify the starting index. If the substring is not found, these methods return 
  `-1`.

```scala
"Hello World".indexOf("o") // 4
"Hello World".indexOf("l", 3) // 3
"Hello World".lastIndexOf("o") // 7
"Hello".indexOf("W"); // -1
```

- You can use `replace` method to replace a substring with another substring. Note that this returns a new string and 
  does not modify the original string.

```scala
val str = "Hello World".replace("World", "there")
println(str) // Hello there
```

- Finally, you can use `concat` method to concatenate two strings. Notice that in the example below, I have used 
  method chaining to concatenate two strings. This is a common pattern in Scala. It is possible because `concat()` 
  method returns a new string.

```scala
val str = "Hello".concat(", ").concat("World")
println(str) // Hello, World
```

In the next lesson, you will learn about string interpolation in Scala which is yet another way to concatenate 
strings together in a more readable and concise way.