import java.util.HashMap

/* TODO */

fun<Key, Value> buildMap(build: HashMap<Key, Value>.() -> Unit) : Map<Key, Value> {
    /* Use the same format as the buildString function in the hint! */

    val hash_map : HashMap<Key, Value> = HashMap<Key, Value>()
    hash_map.build()
    return hash_map
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
