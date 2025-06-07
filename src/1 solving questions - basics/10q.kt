// Use when to print day names for numbers 1 to 7.
fun main() {
    println("enter a number")
    val day = readLine()?.toIntOrNull()
    when (day) {
        1 -> println("monday")
        2 -> println("tuesday")
        3 -> println("wednesday")
        4 -> println("thursday")
        5 -> println("friday")
        6 -> println("saturday")
        7 -> println("sunday")
    }
}
