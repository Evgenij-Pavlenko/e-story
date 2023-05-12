package DTO.users

import Basket

class Customer : User {
    var age = 0
    var payMethod: MutableMap<PayMethod, Double> = mutableMapOf(
        PayMethod.PayPal to 1000.0
    )
    var shoppingBasket: Basket = Basket()

    //
    constructor(name: String, login: String, password: String?, age: Int, payMethod: MutableMap<PayMethod, Double>) : super(
        name,
        login,
        password
    ) {
        this.age = age
        this.payMethod = payMethod
    }

    constructor(name: String, login: String, password: String?, age: Int) : super(
        name,
        login,
        password
    ) {
        this.age = age
    }

    fun printBacket(): String {
        return "${shoppingBasket.print()}"
    }


}