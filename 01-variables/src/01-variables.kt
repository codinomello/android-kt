fun main() {
    // 01 - Variables
    var userName: String = "joão"
    userName = "gabriel"

    var userAge: Int = 25
    userAge = 16

    println("hello $userName! your age is $userAge.")

    // Integer
    val number = 123

    val integerMaxValue = Int.MAX_VALUE
    println("integer max value: $integerMaxValue")

    val integerMinValue = Int.MIN_VALUE
    println("integer min value: $integerMinValue")

    // Byte
    val byte: Byte = 64

    val byteMaxValue: Byte = Byte.MAX_VALUE
    println("byte max value: $byteMaxValue")

    val byteMinValue: Byte = Byte.MIN_VALUE
    println("byte min value: $byteMinValue")

    // Short
    val short: Short = 1

    val shortMaxValue: Short = Short.MAX_VALUE
    println("short max value: $shortMaxValue")

    val shortMinValue: Short = Short.MIN_VALUE
    println("short min value: $shortMinValue")

    // Long
    val long: Long = 987654321

    val longMaxValue: Long = Long.MAX_VALUE
    println("long max value: $longMaxValue")

    val longMinValue: Long = Long.MIN_VALUE
    println("long min value: $longMinValue")

    // Float & Double
    val float = 2.5F
    val double = -12.5

    println("float = $float and double = $double")

    // Char & Boolean
    val char = 'C'
    println("char = $char")

    val boolean = true
    println("boolean = $boolean")
}