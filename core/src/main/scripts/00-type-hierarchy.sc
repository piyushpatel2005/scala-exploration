// Create a variable of `Any` type
var any: AnyVal = 42
println(any)

//any = "Hello" // error: type mismatch

any = true
println(any)

any = 3.14
println(any)

// Converting between types
val x: Int = 42
x.doubleValue()
x.floatValue()

val y: Double = 3.14
y.intValue()

y.longValue()
y.floatValue()

// type information
val greeting: String = "Hello"
println(greeting.getClass)

val number: Int = 51
println(number.getClass)

println(greeting.isInstanceOf[String])
