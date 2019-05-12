import java.util.*

fun <type, collection: MutableCollection<type>> Collection<type>.partitionTo(first: collection, second: collection, predicateToFilterOn: (type) -> Boolean): Pair<collection, collection>
{
    /* Iterate over the elements passed in.
     * If the predicate is true on that current element, then place it in the first section (just like the regular partition function would.
     * If the predicate is false on that current element, then place it in the second section.
     */

    for (element in this)
    {
        if (predicateToFilterOn(element)) first.add(element) else second.add(element)
    }

    return Pair(first, second)
}

fun partitionWordsAndLines() {
    val (words, lines) = listOf("a", "a b", "c", "d e").
            partitionTo(ArrayList<String>(), ArrayList()) { s -> !s.contains(" ") }
    words == listOf("a", "c")
    lines == listOf("a b", "d e")
}

fun partitionLettersAndOtherSymbols() {
    val (letters, other) = setOf('a', '%', 'r', '}').
            partitionTo(HashSet<Char>(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z'}
    letters == setOf('a', 'r')
    other == setOf('%', '}')
}
