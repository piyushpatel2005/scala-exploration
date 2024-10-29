val name = "Jacob"
val city = "New York"
val message = s"Hello, I'm $name. I live in $city."
println(message)

val message = s"Hello, I'm ${name.toUpperCase}. I live in ${city.toLowerCase}."
println(message)

val amount = 123.456
println(s"You owe me $amount")
println(f"You owe me $amount%.2f$$")

// type safety
val amount = 123.456
//println(f"You owe me $amount%d$$") // Error: type mismatch; found : Double required: Int

// raw interpolator
println(s"Hello\tWorld") // Hello    World

println(raw"Hello\tWorld") // Hello\tWorld
println(raw"You owe me 123.45") // You owe me $123.45

val fruit = "apple"
println(s"A basket of $fruits")
println(s"A basket of ${fruit}s")