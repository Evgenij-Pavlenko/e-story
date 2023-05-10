package DTO.users

import Backet

class Customer : User {
    var age = 0
    var payMethod: MutableMap<PayMethod, Double> = mutableMapOf(
        PayMethod.PayPal to 1000.0
    )
    var shoppingBasket: Backet = Backet()

    //
    constructor(name: String, login: String, password: String?, payMethod: MutableMap<PayMethod, Double>) : super(
        name,
        login,
        password
    ){
        this.payMethod = payMethod
    }

    constructor(name: String, login: String, password: String?, age: Int) : super(
        name,
        login,
        password
    ){
        this.age = age
    }

    override fun toString(): String {
        return "$shoppingBasket.n"
    }


}