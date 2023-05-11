import DTO.products.Product

class Basket {
    var productInBasket: MutableList<Product> = mutableListOf()

    constructor(productInBasket: MutableList<Product>) {
        this.productInBasket = productInBasket
    }

    // liere Backet
    constructor() {

    }

    fun addInBasket(product: Product) {
        productInBasket.add(product)
    }

    fun busketSum(): Double {
        var sum = 0.0
        for (product in productInBasket) {
            sum += product.price
        }
        return sum
    }

    fun print() {
        println("In Backet Products:")
        for (product in productInBasket) {
            println("${product.name}: ${product.price}")
        }
    }

    fun deleteFromBasket(shop: Shop): Double {
        var index = 0
        var summDel = 0.0
        for (product in productInBasket) {
            println("[${++index}] - $product")
        }
        // reset the index
        index = 0
        var choiceIndex = readln().toInt()
        for (product in productInBasket) {
            index++
            if (choiceIndex == index) {
                //delete product from Bucket
                productInBasket.remove(product)
                //add Product back in shop
                shop.addProduct(product)
                summDel = product.price
                println("$product was deleted from Backet. Sum in Backet: ${busketSum()} Euro}")
                break
            }
        }
        return summDel
    }

    fun clear() {
        productInBasket.clear()
    }
}

