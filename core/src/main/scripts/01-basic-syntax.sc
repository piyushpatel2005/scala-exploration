1 + 1
1 * 2

// values, immutable
val aVal: Int = 20
val aVal = 20
val hello = "Hello"
//aVal = 200 // Not Ok

// variables, mutable
var aVar: Int = 10
var aVar = 10
aVar = 12 // Ok

println(hello)
println(aVar)

// This is a single line comment
println("Single line comment")

/* This is a multi-line comment
   This is second line of comment */

println("Hello World")
println("Hello Scala")

// Data types
val anInt: Int = 20
val aLong: Long = 20L
val aFloat: Float = 20.0f
val aDouble: Double = 20.0
val aChar: Char = 'a'
val aString: String = "Hello"
val aBoolean: Boolean = true

val aList = List(1, 2, 3)
val aMap = Map("one" -> 1, "two" -> 2, "three" -> 3)
val anArray = Array(1, 2, 3)

// Arithmetic operators
val a = 10
val b = 20
val sum = a + b
val diff = a - b
val mul = a * b
val div = a / b
val mod = a % b

// Relational operators
val isEqual = a == b
val isNotEqual = a != b
val isGreater = a > b
val isLess = a < b
val isGreaterOrEqual = a >= b
val isLessOrEqual = a <= b

// Logical operators
val and = a > 5 && b < 30
val or = a > 5 || b < 30
val not = !(a > 5)

// Bitwise operators
val bitwiseAnd = a & b
val bitwiseOr = a | b
val bitwiseXor = a ^ b
