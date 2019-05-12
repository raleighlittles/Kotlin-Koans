data class Person constructor (val name : String, val age : Int) {
    /*
     * Like the exercise hint says, the "data" class prefix tells Kotlin
     * that our class is used to hold data, so it will automatically generate
     * members out of the variables given in our (primary) constructor.
     *
     * Our class, in C++ terms, would now look like this:
     *
     *  class Person {
     *   string name;
     *   int age;
     *
     *   Person(string name, int age) {
     *      this->name = name;
     *      this->age = age;
     *   }
     *
     *   };
     *
 */
}

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}
