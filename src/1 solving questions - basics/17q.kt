// Create a mutableListOf and perform add, update, and remove operations.
fun main() {
    val lsts = mutableListOf(12, 14, 16, 18, 20)
    println("original $lsts")
    lsts.add(22)
    lsts.remove(12)
    lsts[0] = 10
    println("after add, remove and update $lsts")
}
