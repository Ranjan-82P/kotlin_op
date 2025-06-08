// Create a mapOf with 3 subjects and marks. Print marks of each subject.
fun main() {
    var subjects = mapOf("math" to 95, "science" to 87, "hindi" to 78)
    for ((subject, marks) in subjects) {
        println("marks in $subject is $marks")
    }
}
