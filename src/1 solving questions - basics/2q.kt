// Take two numbers as input and print their sum, difference, product, and division.

fun main() {
    val a = readLine()?.toIntOrNull()
    val b = readLine()?.toIntOrNull()

    val sum = a + b
    val subtraction = a - b
    val product = a * b
    val division = a.toDouble() / b.toDouble()
    print("Sum: $sum\n")
    print("Subtraction: $subtraction\n")
    print("Product: $product\n")
    print("Division: $division\n")
}
