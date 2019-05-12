import java.util.*

/*
 * This example seems quite tricky for someone not familiar with Java.
 *
 * Java has a specific Comparator interface, with a compare method that
 * takes two parameters (elements to sort), and can return either a negative number, 0, or a positive number.
 *
 * To provide a custom sort function here, we use the object expression to create an anonymous Comparator class that
 * overrides the compare() method to provide its own built-in sort functionality. The long-form version of this would be
 * to: 1) Create a class called MySort that inherits from Comparator 2) Provide an override for the compare method
 * 3) Instantiate this class 4) Pass it as the second parameter.
 *
 * By using anonymous classes (Object expressions in Kotlin), we expedite those 4 steps and essentially really boil it
 * down to 1 step -- implement an overload for the compare method.
 *
 */

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object : Comparator<Int> {
        override fun compare(a : Int, b : Int) = b - a
    })
    return arrayList
}
