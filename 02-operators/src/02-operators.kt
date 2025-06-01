fun main () {
    val x = 5
    val y = 3

    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    println("3 + 2 * 4 = ${(3 + 2) * 4}")

    var result = x + y

    result += 2
    println("result += $result")

    result -= 2
    println("result -= $result")

    result *= 2
    println("result *= $result")

    result /= 2
    println("result /= $result")

    result %= 2
    println("result %= $result")

    var z = 0

    println("z++ = ${z++}")
    println("++z = ${++z}")

    println("z-- = ${z--}")
    println("--z = ${--z}")

    val condition = true
    if (condition) {
        println("the condition is true.")
    } else {
        println("the condition is false.")
    }

    val number = 10
    if (number >= 5) {
        println("the number is greater than or equal to 5")
    } else if (number == 6) {
        println("the number is equal to 6")
    } else {
        println("the number is less than 4")
    }

}