package DTO.products.electronic

class Notebook : Electronic{
    var diagonal: Double = 0.0
    var weight: Double = 0.0

    constructor(name: String, price: Double, diagonal: Double, weight: Double) : super(name, price) {
        if (diagonal>0)
        {
            this.diagonal = diagonal
        }
        if (weight>0){
            this.weight = weight
        }

    }
}