// operator.

fun main() {
    val num = readLine()?.toIntOrNull()
    if (num == null) {
        print("the number is even")
    } else if(num % 2 ==0){
        println("the number is even")
    }else{
        print("the number is odd")
    }
