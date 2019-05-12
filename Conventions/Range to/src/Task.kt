/* At first thought, you might think that this function needs to be able to compute all possible dates within an interval.
 * However, that's not quite how the function is used in this context. Here, we just want to be able to check if a date
 * falls within a certain range, which requires absolutely no knowledge of the dates within those ranges, simply the
 * start and end dates (remember in the previous example, we wrote a contains() function for actually checking if a date
 * was within two ranges, here we just need to *create* the actual range -- and what do we use for creating?
 *
 * Constructors!
 *
 * Here we only have one parameter in rangeTo, and from context clues it should be clear that our parameter will represent
 * the end of our range.
 */
operator fun MyDate.rangeTo(other: MyDate) = DateRange(this, other)


class DateRange(override val start: MyDate, override val endInclusive: MyDate): ClosedRange<MyDate>

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}
