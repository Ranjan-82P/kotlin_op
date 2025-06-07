// Use relational and logical operators to compare two numbers and print results.
fun main() {
    println("eneter first number ")
    val num1 = readLine()?.toIntOrNull()
    println("eneter second number ")
    val num2 = readLine()?.toIntOrNull()
    if (num1 == null || num2 == null) {
        print("retry")
    } else if (num1 > num2) {
        print("num1 is greater than num2")
    } else if (num2 > num1) {
        print("num2 is greater than num1")
    } else if (num1 == num2) {
        print("num1 is euqal to num2 ")
    } else {
        print("kuch to lafda hai bhai")
    }
}
