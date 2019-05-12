/* The most obvious part is remembering that any integer I can be expressed as a rational number R where R = I/1.
 * Such extension functions also give you access to the `this` pointer.
 *
 * Also lastly for pairs, Kotlin retains the convention of referring to the elements by .first and .last.
 */
fun Int.r(): RationalNumber = RationalNumber(this, 1)
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(this.first, this.second)

data class RationalNumber(val numerator: Int, val denominator: Int)
