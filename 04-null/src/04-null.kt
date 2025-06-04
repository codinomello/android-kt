// 04 - Null

fun main() {
    // ? = Nullable type
    var text: String? = "null"
    if (text != null) {
        println("text length: ${text.length}")
    } else {
        println("the variable is null.")
    }

    // Safe call operator (?.) returns null
    text = null
    println("text length (safe call): ${text?.length}")

    // Elvis operator (?:) assigns a default value
    val textLength = text?.length ?: 0
    println("text length using elvis operator: $textLength")

    // Not-null assertion operator (!!) forces a NullPointerException error

    /*
    * val name: String? = null
    * val nameLength = name!!.length // Runtime error (Exception in thread "main" java.lang.NullPointerException)
    * println("Length: ${nameLength}")
    */
}