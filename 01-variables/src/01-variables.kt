// 01 - Variables

fun main() {
    var userName: String = "joão" // String-type variable (mutable)
    userName = "gabriel"

    val userAge: Int = 25 // Integer-type value (immutable)

    println("hello $userName! you are $userAge years old.")

    // Int (Integer)
    val number = 123 // 32-bit integer

    val integerMaxValue = Int.MAX_VALUE // 2,147,483,647
    println("integer max value: $integerMaxValue")

    val integerMinValue = Int.MIN_VALUE // -2,147,483,648
    println("integer min value: $integerMinValue")

    // Byte (8-bits)
    val byte: Byte = 64 // 8-bit integer

    val byteMaxValue: Byte = Byte.MAX_VALUE // 127
    println("byte max value: $byteMaxValue")

    val byteMinValue: Byte = Byte.MIN_VALUE // -128
    println("byte min value: $byteMinValue")

    // Short (Short integer)
    val short: Short = 1 // 16-bit integer

    val shortMaxValue: Short = Short.MAX_VALUE // 32,767
    println("short max value: $shortMaxValue")

    val shortMinValue: Short = Short.MIN_VALUE // -32,768
    println("short min value: $shortMinValue")

    // Long (Long integer)
    val long: Long = 987654321 // 64-bit integer

    val longMaxValue: Long = Long.MAX_VALUE // 9,223,372,036,854,775,807
    println("long max value: $longMaxValue")

    val longMinValue: Long = Long.MIN_VALUE // -9,223,372,036,854,775,808
    println("long min value: $longMinValue")

    // Float (Floating-point number)
    val float = 2.5F // 32-bit floating-point number
    println("float = $float")

    // Double (Double-precision floating-point number)
    val double = -12.5 // 64-bit floating-point number

    println("double = $double")

    // Char (Character)
    val char = 'C' // 8-bit Unicode char
    println("char = $char")

    // Boolean (true or false)
    val boolean = true // 8-bit boolean
    println("boolean = $boolean")
}