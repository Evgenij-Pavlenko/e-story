package DTO.users

import DTO.Backet

class Customer : User {
    var payMethod: Map<PayMethod, Double> = mapOf(
        PayMethod.PayPal to 1000.0
    )
    var shoppingBasket: Backet = Backet()

    //
    constructor(name: String, login: String, password: String?, payMethod: Map<PayMethod, Double>) : super(
        name,
        login,
        password
    ){
        this.payMethod = payMethod
    }

    constructor(name: String, login: String, password: String?) : super(
        name,
        login,
        password
    )


}