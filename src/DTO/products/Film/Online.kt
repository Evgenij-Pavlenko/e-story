package DTO.products.Film

class Online: Film {
    var link: String = ""

    constructor(name: String, price: Double, reviews: MutableList<String>, isReal: Boolean, link: String) : super(
        name,
        price,
        reviews,
        isReal
    ) {
        this.link = link
    }

    constructor(name: String, price: Double, isReal: Boolean, link: String) : super(name, price, isReal) {
        this.link = link
    }

    constructor(name: String, price: Double, link: String) : super(name, price) {
        this.link = link
    }
}