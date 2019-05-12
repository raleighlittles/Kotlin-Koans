// String templates allow you to use the pre-defined `month` character group in the regular expression pattern.
// Like in most other languages, \d is the digit metacharacter.

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern(): String = """\d{2} $month \d{4}"""
