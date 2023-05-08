package DTO.users

import DTO.Backet

class Customer : User {
    var payMethod: String = ""
    var shoppingBasket: Backet = Backet()

   //
    constructor(name: String, login: String, password: String?, payMethod: String) : super(
        name,
        login,
        password
    ) {
        this.payMethod = payMethod

    }

    constructor(name: String, login: String, password: String?) : super(
        name,
        login,
        password
    ) {
        this.payMethod = "PayPal"
    }

}