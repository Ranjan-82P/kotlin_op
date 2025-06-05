// here we learn , if else and when conditionals in kotlin  when matlab switch in other languages
fun main() {
    val age = 18

    // if condition
    if (age >= 18) {
        println("You are adult")
    }

    // if-else
    val marks = 60
    if (marks >= 50) {
        println("Passed")
    } else {
        println("Failed")
    }

    // else-if ladder
    val score = 85
    if (score >= 90) {
        println("Grade: A")
    } else if (score >= 80) {
        println("Grade: B")
    } else if (score >= 70) {
        println("Grade: C")
    } else {
        println("Grade: D")
    }

    // when (like switch)
    val day = 3
    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        else -> println("Other day")
    }
}
