fun main() {
    // for loop (fixed times)
    for (i in 1..5) {
        println("i = $i")
    }

    // while loop (check before run)
    var j = 1
    while (j <= 5) {
        println("j = $j")
        j++
    }

    // do-while (runs at least once)
    var k = 1
    do {
        println("k = $k")
        k++
    } while (k <= 5)

    // for each item in array
    val names = arrayOf("Ranjan", "Cutie", "Hubby")
    for (name in names) {
        println("Name: $name")
    }
}
