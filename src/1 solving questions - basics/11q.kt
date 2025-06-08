/*
Grade a student based on marks:
90+ → A
80–89 → B
70–79 → C
Below 70 → D */
fun main() {
    println("emter your marks  out of 100 ")
    val marks = readLine()?.toIntOrNull()
    when (marks) {
        in 90..100 -> println("grade a")
        in 80..89 -> println("grade b")
        in 70..79 -> println("grade c")
        in 0..70 -> println("grade d")
    }
}
