package DTO.users

import DTO.Backet
import DTO.products.Product

class Customer : User {
    var payMethod: String = ""
    var shoppingBasket: Backet = Backet()

   //
    constructor(name: String, login: String, password: String?, payMethod: String, shoppingBasket: Backet) : super(
        name,
        login,
        password
    ) {
        this.payMethod = payMethod
        this.shoppingBasket = shoppingBasket
    }

    constructor(name: String, login: String, password: String?) : super(
        name,
        login,
        password
    ) {
        this.payMethod = "PayPal"
    }

}