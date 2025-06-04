// 03 - Conditionals

fun main() {
    // Conditional statement
    val isTrue = false
    if (isTrue) {
        println("the condition is true.")
    } else {
        println("the condition is false.")
    }

    // Comparison operators

    /*
    * > : Greater than
    * < : Less than
    * >= : Greater than or equal to
    * <= : Less than or equal to
    */

    val number = 10
    if (number >= 5) {
        println("the number is greater than or equal to 5.")
    } else if (number == 6) {
        println("the number is equal to 6.")
    } else {
        println("the number is less than 4.")
    }

    // Equality operators

    /*
    * == : Equal to
    * != : Not equal to
    */

    val a = 10
    val b = 20
    val c = 10

    println("a == b: ${a == b}") // false
    println("a == c: ${a == c}") // true

    println("a != b: ${a != b}") // true
    println("a != c: ${a != c}") // false

    // Logical AND operator

    /*
    * true && true = true
    * true && false = false
    * false && false = false
    * false && true = false
    */

    val isPlaying = true
    val score = 100
    if (isPlaying && score == 100) {
        println("next level unlocked! (AND logic)")
    } else {
        println("still on the same level. (AND logic)")
    }

    // Logical OR operator

    /*
    * true || true = true
    * true || false = true
    * false || false = false
    * false || true = true
    */

    val hasKey = false
    val knowsPassword = true
    if (hasKey || knowsPassword) {
        println("access granted! (OR logic)")
    } else {
        println("access denied. (OR logic)")
    }

    // Logical NOT operator

    /*
    * !true = false
    * !false = true
    */

    val isLoggedIn = false
    if (!isLoggedIn) {
        println("user is not logged in. (NOT logic)")
    } else {
        println("user is logged in! (NOT logic)")
    }

    // Shorthand if-else (ternary operator)
    val age = 18
    val ternary = if (age >= 18) "adult" else "minor"
    println("you are an: $ternary")
}