package DTO.products.electronic

class TV : Electronic {
    var diagonal: Int = 0

    constructor(name: String, price: Double, diagonal: Int) : super(name, price) {
        if (diagonal>0){
            this.diagonal = diagonal
        }
    }
}