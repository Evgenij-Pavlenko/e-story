import DTO.products.Product
import Shop

class Backet {
    var productInBacket: MutableList<Product> = mutableListOf()

    constructor(productInBacket: MutableList<Product>) {
        this.productInBacket = productInBacket
    }

    // liere Backet
    constructor() {

    }

    fun addInBacket(product: Product) {
        productInBacket.add(product)
    }

    fun bucketSum(): Double {
        var sum = 0.0
        for (product in productInBacket) {
            sum += product.price
        }
        return sum
    }

    fun print() {
        println("In Backet Products:")
        for (product in productInBacket) {
            println("${product.name}: ${product.price}")
        }
    }

    fun deleteFromBacket(shop: Shop): Double {
        var index = 0
        var summDel = 0.0
        for (product in productInBacket) {
            println("[${++index}] - $product")
        }
        // reset the index
        index = 0
        var choiceIndex = readln().toInt()
        for (product in productInBacket) {
            index++
            if (choiceIndex == index) {
                //delete product from Bucket
                productInBacket.remove(product)
                //add Product back in shop
                shop.addProduct(product)
                summDel = product.price
                println("$product was deleted from Backet. Sum in Backet: ${bucketSum()} Euro}")
                break
            }
        }
        return summDel
    }

    fun clear() {
        productInBacket.clear()
    }
}

