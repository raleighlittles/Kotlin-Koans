import java.util.*

/* This example is similar to the last one, but instead of using an object expression, we're supposed to use the SAM
 * conversion technique.
 *
 * This sentence from the documentation explains it well:
 *
 * This means that Kotlin function literals can be automatically converted into implementations of Java interfaces with
  * a single non-default method, as long as the parameter types of the interface method match the parameter types of
  * the Kotlin function.
  *
  * The function literal here is the part after the arrow -- since x,y match the parameter types of the compare()
  * method of a Comparator interface for integers, Kotlin's compiler will simply create a compare() function taking
  * x and y as parameters and use our functional literal as the implementation.
 *
 */

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, { x, y -> y-x })
    return arrayList
}
