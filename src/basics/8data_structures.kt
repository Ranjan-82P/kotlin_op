fun main() {
    // ----- ARRAY -----
    val nums = arrayOf(1, 2, 3, 4)
    println("Array element: ${nums[0]}")
    println("Array size: ${nums.size}")
    nums[1] = 10
    for (n in nums) {
        println("num = $n")
    }

    // ----- LIST (Immutable) -----
    val fruits = listOf("Apple", "Banana", "Mango")
    println("First fruit: ${fruits[0]}")
    println("Total fruits: ${fruits.size}")
    // fruits[0] = "Kiwi" ❌ not allowed (read-only)

    // ----- LIST (Mutable) -----
    val colors = mutableListOf("Red", "Blue")
    colors.add("Green")
    colors[0] = "Yellow"
    for (color in colors) {
        println("Color: $color")
    }

    // ----- MAP (like dictionary) -----
    val marks = mapOf("Math" to 90, "Eng" to 85)
    println("Math marks: ${marks["Math"]}")

    val students = mutableMapOf("A" to 10, "B" to 20)
    students["C"] = 30 // add
    students["A"] = 15 // update
    for ((key, value) in students) {
        println("$key → $value")
    }
}
