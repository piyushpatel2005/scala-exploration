# Scala Data Types

Scala has a several data types built-in to the language. These data types can be broadly categorized into two types.
1. Value Types
2. Reference Types

## Value Types

Value types are types that are represented as primitive types in Java. These includes types like `Int`, `Float`, 
`Double`, `Boolean`, `Char`, `Byte`, `Short` and `Long`. They have primitive equivalents in Java language. Usually 
these types are stored on the stack memory and are usually passed by value in method or function calls. Let's see 
some examples of value types.

| Type | Description |
| ---- | ----------- |
| `Int` | 32-bit signed integer |
| `Float` | 32-bit single precision floating point number |
| `Double` | 64-bit double precision floating point number |
| `Boolean` | `true` or `false` |
| `Char` | 16-bit unsigned Unicode character |
| `Byte` | 8-bit signed integer |
| `Short` | 16-bit signed integer |
| `Long` | 64-bit signed integer |

Let's see some examples of these.

```scala
val anInt: Int = 20
val aLong: Long = 20L
val aFloat: Float = 20.0f
val aDouble: Double = 20.0d // default
val aChar: Char = 'a'
val aBoolean: Boolean = true
```

You specify `L` for `Long` and `f` for `Float` to avoid any confusion with other types. In this example, I have 
explicitly specified the type of the variable. You can also omit the type and let Scala infer the type for you. Also 
notice that the `Double` type value is assigned using `d` suffix. This is optional as `Double` is the default type 
for floating point numbers. However, you do need to specify `f` for `Float` type and `L` for `Long` types.

Although in Java, primitive types do not have methods, in Scala, they do. Scala uses implicit conversions to convert 
primitive types to rich classes. For example, `Int` has `RichInt`, `Float` has `RichFloat`, `Double` has 
`RichDouble` etc. The implicit conversion occurs automatically, so for developers there is no extra typing. These rich 
classes 
provide 
additional methods to the value types and makes them 
lot more convenient to work with in Scala. You will learn more about implicit conversions in upcoming lessons.

## Reference Types

These are objects and usually contains data and methods to operate on the data. Examples of reference types include 
`String`, `List`, `Tuple`, `Map`, `Array`, `Set` etc. These are passed by reference in method or function calls. 
They also include user defined classes and traits. 

- String is a sequence of characters. These are used to store textual information such as name, address, position, etc.

```scala
val aString: String = "Hello World"
```

### Collection Types

Collection types are containers which can include other data types. Those other data types can be any of the 
built-in types or any user defined types. This is just a brief overview of these types and I will discuss them in 
more details on their specific lessons.

- Arrays are used to store fixed number of elements of the same type.

```scala
val anArray: Array[Int] = Array(1, 2, 3)
val stringArray: Array[String] = Array("Tom", "Jerry", "Donald")
```

- Lists are used to store ordered elements of the same type. 

```scala
val numbers: List[Int] = List(1, 2, 3, 4)
val colors: List[String] = List("Red", "Green", "Blue")
```

- Sets are used to store unique elements of the same type. If you try to insert 
  the same value again, it will be ignored.

```scala
val numberSet: Set[Int] = Set(1, 2, 3, 4, 4, 3)
println(numberSet) // Set(1, 2, 3, 4)
val colorSet: Set[String] = Set("Red", "Green", "Blue")
```

- Maps are used to store key-value pairs. These are used to associate a property to a value. In the defition of the 
  map, the first type is the key type and the second type is the value type.

```scala
val fruits: Map[String, String] = Map("apple" -> "red", "banana" -> "yellow", "grape" -> "black")
val months: Map[Int, String] = Map(1 -> "January", 2 -> "February", 3 -> "March")
```
