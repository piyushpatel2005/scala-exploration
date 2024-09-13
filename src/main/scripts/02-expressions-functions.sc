
// If Expression
val x = 10
val y = 20
val max = if (x > y) x else y
println(max) // 20

// If Expression with else if
val max2 = if (x > y) x else if (x < y) y else 0

// Functions
def add(x: Int, y: Int): Int = {
  x + y
}

def subtract(a: Int, b: Int): Int = {
  a - b
}

val additionResult = add(10, 20)
val subtractionResult = subtract(20, 10)
println(additionResult) // 30
println(subtractionResult) // 10

// Function with Single Expression
def perimeter(width: Int, height: Int): Int = width * 2 + height * 2

// Function with No Return Type
def introduce(name: String): Unit = println("Hello, my name is " + name)
introduce("Javed") // Hello, my name is Javed

// Function with Default Params
def add(a: Int, b: Int = 10): Int = a + b
val result = add(10)
println(result) // 20
