/* The hint itself gives away the solution for free here, but at least it introduces you one of the built-in collection
 * functions. Here's a few more: https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index.html
 */
fun getList(): List<Int> {
    return arrayListOf(1, 5, 2).sortedDescending()
}
