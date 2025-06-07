// Check if a number is positive, negative, or zero using if-else.
fun main() {
    println("eneter a number")
    val number = readLine()?.toIntOrNull()
    if (number == null) {
        print("pagal haui kya bai , wapas kar ")
    } else if (number < 0) {
        println("the number is negative ")
    } else {
        println("the number is positive")
    }
}
