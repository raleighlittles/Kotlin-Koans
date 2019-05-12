/*
 * Iterate over the list of customers, and for each customer, count the number of orders they have -- then return the maximum
 * of that.
 */
// Return a customer whose order count is the highest among all customers
fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? {
    return customers.maxBy({it.orders.count()})
}

/*
 * Use the flat map technique discovered in the previous exercise!
 *
 * Start with the orders object, then use flatmap to extract only the product list (and not the isDelivered variable),
 * then from the product list, select the maximum price.
 */
// Return the most expensive product which has been ordered
fun Customer.getMostExpensiveOrderedProduct(): Product? = orders.flatMap({it.products}).maxBy({it.price})
