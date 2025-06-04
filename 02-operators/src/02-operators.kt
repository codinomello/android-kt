// 02 - Operators

fun main() {
    // Mathematical operators

    /*
    * +: Addition
    * -: Subtraction
    * *: Multiplication
    * /: Division
    * %: Modulus
    */

    val x = 5
    val y = 3

    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    // Precedence of operations
    println("3 + 2 * 4 = ${(3 + 2) * 4}")

    // Compound assignment
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

    // Unary operators

    /*
    * ++: Increment
    * --: Decrement
    */

    var z = 0

    println("z++ = ${z++}") // prints 0, then increments
    println("++z = ${++z}") // increments, then prints

    println("z-- = ${z--}") // prints 2, then decrements
    println("--z = ${--z}") // decrements, then prints
}