/*
 * This one is interesting.
 * We have several products, and we want to display them in a table that has alternating colors. Tr represents our table
 * rows and td represents our table cells (td = table data). Each row has 3 cells, corresponding to the product properties
 * of price, popularity, and description. We have helper functions written for us to correctly decide the color needed,
 * now we only have to assign the colors ourselves.
 *
 * Additionally, for the actual table data, we have to correctly manipulate the getCellColor() function to color our cells
 * and also display the product information we want.
 */
fun renderProductTable(): String {
    return html {
        table {
            tr (getTitleColor()){
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            var row : Int = 0
            for ((index, product) in products.withIndex())
            { /* Table has 3 rows. Create them! */
                tr {
                    td (getCellColor(index, row)) {
                            text(product.description)
                    }

                    td (getCellColor(index, row++)) {

                        text(product.popularity)
                    }

                    td (getCellColor(index, row++)) {
                        text(product.price)
                    }
                }
            }

        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) %2 == 0) "#dce4ff" else "#eff2ff"
