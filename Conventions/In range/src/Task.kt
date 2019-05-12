class DateRange(val start: MyDate, val endInclusive: MyDate)
{
    operator fun contains(d: MyDate) : Boolean {
       /* This example kind of requires a memory of the previous exercise, where we wrote
        * a comparison operator for the MyDate class type. Now is the time to use that operator!
        *
        * One gotcha though, the hint doesn't state that the start range is inclusive, but the test cases expect it to be.
        */
        return (start <= d) && (d <= endInclusive)
    }
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}
