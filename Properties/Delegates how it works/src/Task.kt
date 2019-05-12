import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/*
 * This is a fairly straightforward implementation of getters/setters. Like the hint says, you'll need the extension
 * functions provided to do some of the date conversions and such.
 */
class D {
    var date: MyDate by EffectiveDate()
}

class EffectiveDate<R> : ReadWriteProperty<R, MyDate> {

    var timeInMillis: Long? = null

    override fun getValue(thisRef: R, property: KProperty<*>): MyDate {
        return timeInMillis!!.toDate()
    }

    override fun setValue(thisRef: R, property: KProperty<*>, value: MyDate) {
        timeInMillis = value.toMillis()
    }
}

