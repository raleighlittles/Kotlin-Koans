/* Besides just reading about regular properties, you also need some background on Backing Properties, with AFAIK are
 * a Kotlin-specific thing. Basically they're any type of property where you use the default implementation of any accessor.
 * Backing keywords have a special keyword `field` you use to access them from within a getter/setter.
 *
 * In this example, we use the field keyword to assign the current property (propertyWithCounter, an int) to the variable
 * new_value, and then increment the counter variable as requested.
 */
class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        set(new_value: Int?)
        {
            field = new_value
            counter++
        }
}
