// Exploit the fact that even numbers are divisible by 2.
fun containsEven(collection: Collection<Int>): Boolean = collection.any { element : Int -> element % 2 == 0}
