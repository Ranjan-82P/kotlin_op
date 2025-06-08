// Create a listOf 3 fruits. Print each fruit with its index.
fun main() {
    val fruits = listOf("apple ", "banana", "mango", "orange", "lichi")
    for ((index, fruit) in fruits.withIndex()) {
        println("$index - $fruit")
    }
}
