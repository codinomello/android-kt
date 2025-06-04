fun main(args: Array<String>) {
    println("sum of all numbers: ${sumAllNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9)}")
}

fun sumAllNumbers(vararg numbers: Int): Int {
    var result = 0
    for (number in numbers) {
        result += number
    }
    return result
}