// Write a program to check if a number is even or odd using the modulus operator.

fun main() {
    val num = readLine()?.toIntOrNull()
    if (num == null) {
        print("retry ")
    } else if (num % 2 == 0) {
        println("the number is even")
    } else {
        print("the number is odd")
    }
}
