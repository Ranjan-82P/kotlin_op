//// Sum all numbers from 1 to n (input by user) using do-while.

fun main() {
    println("eneter a number cutie")
    val n = readLine()?.toIntOrNull()
    if (n == null || n < 1) {
        println("Please enter a valid positive integer.")
        return
    }
    var sum = 0
    var i = 1
    do {
        sum += i
        i++
    } while (i <= n)
    println("the sum of all numbers from 1 to $n is $sum")
}
