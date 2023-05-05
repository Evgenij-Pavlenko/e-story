package DTO

import DTO.products.Product

class Backet {
var productInBacket: MutableList<Product> = mutableListOf()

    constructor(productInBacket: MutableList<Product>) {
        this.productInBacket = productInBacket
    }
    // liere Backet
    constructor(){

    }
}
