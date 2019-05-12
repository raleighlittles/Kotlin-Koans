import TimeInterval.*

/*   A couple of things to note here:
 *
 *  1) Order of operations -- this affects figuring out which operator overloads we're actually going to need to write.
 *  2) Multiplication is just repeated addition -- we already know we have an addTimeIntervals function so we should try to
 *     leverage that.
 *
 *  As the suggestion indicates, we'll make a separate class to handle multiple time intervals, as the enum values themselves
 *  simply represent integers and don't map well to date information.
 */

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }


operator fun MyDate.plus(timeInterval: TimeInterval) : MyDate
{
    return addTimeIntervals(timeInterval, 1)
}

class TimeIntervals(val timeInterval: TimeInterval, val number: Int)

operator fun TimeInterval.times(number: Int) : TimeIntervals
{
    return TimeIntervals(this, number)
}

operator fun MyDate.plus(timeIntervals: TimeIntervals) = addTimeIntervals(timeIntervals.timeInterval, timeIntervals.number)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
   return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
