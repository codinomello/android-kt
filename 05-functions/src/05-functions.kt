// 05 - Functions

fun main(args: Array<String>) {
    // Function call without parameters
    printHelloWorld()

    // Function with two parameters
    greetUser("gustavo", 14)

    // Conditional structure that calls a function
    val hasInternetConnection = true
    if (hasInternetConnection) {
        getData("beep!")
    } else {
        showErrorMessage()
    }

    // Function that returns the smallest number and stores it inside a value
    val smallestNumber = getSmallestNumber(4.3F, 2.1F)
    println("the smallest number is $smallestNumber")

    // Function that returns the biggest number and stores it inside a value
    val biggestNumber = getBiggestNumber(1.2, 2.3, 4.5)
    println("the biggest number is $biggestNumber")

    // Function call with named parameters
    createUser(
        name = "alice",
        age = 30,
        email = "alice@email.com"
    )
    createUser(email = "bob@email.com",
        age = 25,
        name = "bob"
    )
    createUser(
        "carol",
        email = "carol@email.com",
        age = 28
    )

    // Parameters with default values
    createUser(name = "daniel")

    // Function with vararg (variable argument)
    listNumbers(1, 2, 3)
}

// Function without any parameter
fun printHelloWorld() {
    println("hello, world!")
}

// Function with two parameters
fun greetUser(name: String, age: Int) {
    println("hello, $name! your age is $age.")
}

// Function with a string as argument
fun getData(data: String) {
    println("your data is: $data")
}

// Function without parameters
fun showErrorMessage() {
    println("there's no internet connection.")
}

// Function with a conditional expression that returns the smallest number
fun getSmallestNumber(a: Float, b: Float): Float = if (a < b) a else b

// Function that returns the biggest numbers between the three passed values
fun getBiggestNumber(a: Double, b: Double, c: Double): Double {
    return if (a >= b && a >= c) {
        a
    } else if (b >= a && b >= c) {
        b
    } else {
        c
    }
}

// Function with default values and named parameters
fun createUser(name: String, age: Int = 18, email: String = "null@email.com") {
    println("user info:")
    println("-> name: $name")
    println("-> age: $age")
    println("-> email: $email")
}

// Function with vararg (accepts multiple integers)
fun listNumbers(vararg numbers: Int) {
    println("received numbers: ${numbers.contentToString()}")
}