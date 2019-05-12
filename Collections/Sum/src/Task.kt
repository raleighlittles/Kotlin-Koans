/*
 * More of the same flat map usage from the previous exercise(s).
 * Start with orders, use flatmap to extract products only, and then sum over the price field of each product.
 */
// Return the sum of prices of all products that a customer has ordered.
// Note: the customer may order the same product for several times.
fun Customer.getTotalOrderPrice(): Double = orders.flatMap({it.products}).sumByDouble({it.price})
