fun main() {
    print("Enter name: ")
    val name = readLine() // read string input

    print("Enter age: ")
    val age = readLine()?.toIntOrNull() // read number input safely
    // here toInt converts string to integer,
    // and orNull for if the string gets converted to numm like if user intered hello or hii then
    // cant be int later so it will show as null

    println("Name: $name, Age: $age") // print inputs
    // while priting multiple things in same line we use $variable like this
    // if you want to print multiple variables in same line then use $variable1, $variable2
}
// This program reads user input for name and age, then prints them.
