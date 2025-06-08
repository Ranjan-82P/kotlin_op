// Input 5 student names in a mutable list and print them using a loop.
fun main() {
    val op = mutableListOf<String>()
    for (i in 1..5) {
        println("enter student name")
        val name = readLine() ?: ""
        op.add(name)
    }
    println("Student names:")
    for (name in op) {
        print("$name : ")
    }
}
 // compelated 20  questions on 8 /6/2025
