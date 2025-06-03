fun main() {
    // val = can't change later (like a final value)
    val name = "Ranjan"
    val age = 21

    // var = can change later (like a normal variable)
    var city = "Delhi"
    city = "Mumbai" // changed value

    // different data types
    // kotlin automatically detects data types
    // but you can also specify them if you want

    val isCute = true // Boolean
    val grade = 'A' // Char
    val height = 5.9 // Double
    val score = 99 // Int
    val initial = name[0] // Char from String

    // print all
    println("Name: $name")
    println("Age: $age")
    println("City: $city")
    println("Cute: $isCute")
    println("Grade: $grade")
    println("Height: $height")
    println("Score: $score")
    println("Initial: $initial")
}
