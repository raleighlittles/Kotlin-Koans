/* This example (like the previous one) demonstrates some of the power of smart casting. In each `is` block, after checking
 * the type of expr, it is automatically converted to that type -- no need to manually cast, like in the Java example.
 */
fun eval(expr: Expr): Int =
        when (expr) {
            is Num -> {expr.value }
            is Sum -> eval(expr.left) + eval(expr.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr
