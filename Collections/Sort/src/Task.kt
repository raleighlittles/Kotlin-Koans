/*
 * Similar logic pattern as before. Start with customers -- each customer has an order field, so count it, and sort by that.
 */
// Return a list of customers, sorted by the ascending number of orders they made
fun Shop.getCustomersSortedByNumberOfOrders(): List<Customer> = customers.sortedBy({it.orders.count()})
