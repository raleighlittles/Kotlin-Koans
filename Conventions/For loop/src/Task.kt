
/* Before you begin to implement an iterator, you must make sure the DateRange class inherits from the Iterable
 * class.
 */
class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {

    override fun iterator() : Iterator<MyDate>
    {
        return DateIterator(this)
    }
}

/* Somewhat obvious, but make sure that you use Iterator<MyDate>, and not Iterator<DateRange> .
 * The former says, I'd like to iterator over dates (which is what you want!), and the latter says
 * I'd like to iterator over a set of date *ranges*, which is not what you want. The next() function
 * implemented must have the same return type as the Iterator you're using.
 */
class DateIterator(val dateRange : DateRange) : Iterator<MyDate>
{
    // Member variable to keep track of position
    var current : MyDate = this.dateRange.start

    /* As long as the current day is less than or equal to the date range end, you can continue iterating */
    override fun hasNext() : Boolean {
        return this.current <= this.dateRange.end
    }

    override fun next() : MyDate
    {
        /* Use the nextDay() function per the suggestion, and also be careful to make sure you
         * increment the `current` variable correctly otherwise your iterator will never finish. */
        val result = current
        current = current.nextDay()
        return result
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
