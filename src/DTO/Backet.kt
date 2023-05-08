package DTO

import DTO.products.Product

class Backet {
    var productInBacket: MutableList<Product> = mutableListOf()

    constructor(productInBacket: MutableList<Product>) {
        this.productInBacket = productInBacket
    }

    // liere Backet
    constructor() {

    }

    fun addInBacket(product: Product){
        productInBacket.add(product)
    }

    fun bucketSum(bucket: Backet): Double {
        var sum = 0.0
        for (product in productInBacket) {
            sum += product.price
        }
        return sum
    }
}
