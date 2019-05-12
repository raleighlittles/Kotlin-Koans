/*
 * This example is, well, funky. The documentation of apply technically actually tells you what to do...
 * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/apply.html
 * > "Calls the specified function block with this value as its receiver and returns this value."
 *
 * Hence, we invoke the specified function block (which is just the parameter to the function, and then return this.
 */
fun <T> T.myApply(f: T.() -> Unit): T {
    f()
    return this

}

fun createString(): String {
    return StringBuilder().myApply {
        append("Numbers: ")
        for (i in 1..10) {
            append(i)
        }
    }.toString()
}

fun createMap(): Map<Int, String> {
    return hashMapOf<Int, String>().myApply {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
