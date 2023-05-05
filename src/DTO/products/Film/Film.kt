package DTO.products.Film

import DTO.products.Product

open class Film :Product {
    var isReal: Boolean = false

    constructor(name: String, price: Double, reviews: MutableList<String>, isReal: Boolean) : super(
        name,
        price,
        reviews
    ) {
        this.isReal = isReal
    }

    constructor(name: String, price: Double, isReal: Boolean) : super(name, price) {
        this.isReal = isReal
    }
    constructor(name: String, price: Double) : super(name, price) {
    }
}