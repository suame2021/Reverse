fun main(a: Array<String>) {
    var num = 4209678
    println("Original Number : " + num)
    println("Reversed Number : " + reverseNumber(num))
}

fun reverseNumber(number: Int): Int {
    var number = number
    var reverse = 0
    while (number != 0) {
        reverse = reverse * 10 + number % 10
        number = number / 10
    }
    return reverse
}



