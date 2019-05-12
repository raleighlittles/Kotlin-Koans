/* In the exercise where we first were introduced to data classes, at the bottom of the data class documentation there
 * was a sentence that said: "Component functions generated for data classes enable their use in destructuring declarations".
 *
 * If you didn't catch this, the included documentation in the hint gives an example of this.
 */
data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

fun isLeapDay(date: MyDate): Boolean {

    val (year, month, dayOfMonth) = date

    // 29 February of a leap year
    return year % 4 == 0 && month == 2 && dayOfMonth == 29
}
