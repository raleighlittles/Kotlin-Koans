/* Remember that in the customer, we only have access to products through the orders list.
* We use flatmap to 'flatten' our orders information down to only the products (ignoring the isDelivered value),
*  and lastly, convert that to a Set to return the right type. */
// Return all products this customer has ordered
fun Customer.getOrderedProducts(): Set<Product>  = orders.flatMap({it.products}).toSet()


/* In the shop object, we can access the customers list. Once we have a list of customers, we can use the function
 * defined above to retrieve the products that each customer has ordered -- and then from there simply use flatmap
 * to flatten the resulting list.
 */
// Return all products that were ordered by at least one customer
fun Shop.getAllOrderedProducts(): Set<Product> = customers.flatMap({it.getOrderedProducts()}).toSet()
