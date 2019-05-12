class LazyProperty(val initializer: () -> Int) {
    // Initial invocation
    var value: Int? = null
    val lazy: Int
        get() {
            if (value == null) {
                value = initializer()
            }

            return value!!

        }
}
