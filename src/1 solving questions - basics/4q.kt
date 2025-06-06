// Declare variables for name (String), age (Int), and height (Double). Print all values.

fun main() {
    print("Enter your name: ")
    val name = readLine()
    print("Enter your age: ")
    val age = readLine()?.toInt()
    print("Enter your height: ")
    val height = readLine()?.toDouble()

    println("Name = $name")
    println("Age = $age")
    println("Height = $height")
}
