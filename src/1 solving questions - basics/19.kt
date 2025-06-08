// Create a mutableMapOf, add 2 more key-value pairs, and update one.
fun main() {
    val results = mutableMapOf("maths" to 87, "science" to 92, "hindi" to 78)
    results["english"] = 85 // adding new pair
    results["social"] = 89 // adding new pair
    results["maths"] = 98 // updating
}
