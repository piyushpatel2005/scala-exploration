// While loop
var i = 0
while (i < 3) {
  println(s"i is $i")
  i += 1
}

// Do while loop is dropped in Scala 3
//do {
//  println(s"i is $i")
//  i -= 1
//} while (i >= 0)

// For Loop
for (i <- 1 to 5) {
  println(s"i => $i")
}


// Using until

for (i <- 1 until 5) {
  println(i)
}

// Using by
for (i <- 1 to 10 by 2) {
  println(i)
}

// Iterating over a list
val names = List("John", "Johny", "Jane")
for (name <- names) {
  println(name)
}



