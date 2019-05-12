/* Group by works the exact same as you would expect it to, from SQL for example. */
// Return a map of the customers living in each city
fun Shop.groupCustomersByCity(): Map<City, List<Customer>> = customers.groupBy({it.city})
