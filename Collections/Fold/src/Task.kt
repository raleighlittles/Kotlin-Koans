/*
 * The big take-away here is to realize you're just computing the intersection over a set of sets.
 *
 */

// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
   val allProducts : Set<Product> = customers.flatMap({it.orders}).flatMap({it.products}).toSet()

    return customers.fold(allProducts, {productsOrderedByAll, customer -> productsOrderedByAll.intersect(customer.orders.flatMap ({ it.products}).toSet())})
}
