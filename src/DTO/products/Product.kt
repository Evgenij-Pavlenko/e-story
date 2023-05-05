package DTO.products

open class Product {

    var name: String = ""
    var price: Double = 0.0
    var reviews: MutableList<String> = mutableListOf()

    // Constructor mit alle Parameter
    constructor(name: String, price: Double, reviews: MutableList<String>) {
        this.name = name
        this.price = price
        this.reviews = reviews
    }

    // Constructor ohne  reviews
    constructor(name: String, price: Double) {
        this.name = name
        this.price = price

    }
}