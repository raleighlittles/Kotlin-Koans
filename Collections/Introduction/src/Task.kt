/* The hint basically gives this one away.
 * We know our function is going to return a set.
 * We know our class has a member variable called `customers` that is a list..
 */
fun Shop.getSetOfCustomers(): Set<Customer> = customers.toSet()
