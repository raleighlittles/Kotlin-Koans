/*
 * Use the filter function to immediately start filtering on customers. Then, partition each customer's orders
 * based on whether it was delivered or not. Per the documentation on the partition function, it returns a
 * pair of lists, where the condition you specified is true for the first pair, but false for the second pair.
 *
 * We then compare the relative sizes of these lists (in the pair), using the result of the comparison to filter out for the customer specifically.
 */

// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> {

    return customers.filter({
        it.orders.partition ({ it.isDelivered == true}).first.size <
                it.orders.partition ({ it.isDelivered == true}).second.size

    }).toSet()
}
