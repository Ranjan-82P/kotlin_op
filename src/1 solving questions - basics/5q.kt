// Convert a String to Int safely using .toIntOrNull() and handle null values.
fun main() {
    println("Enter a number: ")
    val input = readLine()?.toIntOrNull()
    println(input)
}
