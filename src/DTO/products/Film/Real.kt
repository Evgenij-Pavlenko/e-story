package DTO.products.Film
import DTO.products.Film.TypeFilmBox.*
class Real : Film{
    var type: TypeFilmBox = DVD

    constructor(name: String, price: Double, reviews: MutableList<String>, isReal: Boolean, type: TypeFilmBox) : super(
        name,
        price,
        reviews,
        isReal
    ) {
        this.type = type
    }

    constructor(name: String, price: Double, isReal: Boolean, type: TypeFilmBox) : super(name, price, isReal) {
        this.type = type
    }

    constructor(name: String, price: Double, type: TypeFilmBox) : super(name, price) {
        this.type = type
    }
}