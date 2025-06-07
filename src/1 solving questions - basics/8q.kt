// Calculate the area and perimeter of a rectangle with given width and height.
fun main() {
    print("enter the width of the rectangle ")
    var width = readLine()?.toDoubleOrNull()
    print("enter the height of the rectangle ")
    var height = readLine()?.toDoubleOrNull()

    if (width != null && height != null) {
        val area = width * height
        val perimeter = 2 * (width + height)
        println("Area: $area")
        println("Perimeter: $perimeter")
    } else {
        println("invalid input")
    }
}
