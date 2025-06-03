// 5operators.kt
fun main() {
    val a = 10
    val b = 3

    // Arithmetic Operators (basic math)
    println("Add: ${a + b}") // + addition
    println("Sub: ${a - b}") // - subtraction
    println("Mul: ${a * b}") // * multiplication
    println("Div: ${a / b}") // / division (integer result)
    println("Mod: ${a % b}") // % remainder after division

    // Assignment Operators (change variable values)
    var x = 5
    x += 2 // same as x = x + 2
    println("x after += 2: $x")

    // Comparison Operators (true/false checks)
    println("a == b: ${a == b}") // equal
    println("a != b: ${a != b}") // not equal
    println("a > b: ${a > b}") // greater than
    println("a < b: ${a < b}") // less than

    // Logical Operators (check multiple conditions)
    val c = true
    val d = false
    println("c && d: ${c && d}") // true only if both are true
    println("c || d: ${c || d}") // true if at least one is true
    println("!c: ${!c}") // not operator (reverses true/false)
}
