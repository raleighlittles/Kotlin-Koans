data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {

    /* Kotlin's operator overloading works differently than C++ due to the different Comparator interface. Whereas
     * in C++, you'd need to define at least 2 out of the 3 comparison operators to use them all, in Java's
      * Comparator interface you can define only one, a general comparison.
      *
      * The logic for this function is basically:
      *
      *  do the dates start with the same year? If no, then take the difference of their years -- the result's sign
      *  will indicate which one is larger. If they do have the same year, then go down to the next unit, which
      *  is months, and repeat the same process. By the time you reach the last line, the two dates would have
      *  the same month and year and so this the only difference is their day. */
    override operator fun compareTo(other : MyDate) : Int
    {
        if (this.year != other.year)
        {
            return this.year - other.year
        }

        if (this.month != other.month)
        {
            return this.month - other.month
        }

        return this.dayOfMonth - other.dayOfMonth
    }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2
