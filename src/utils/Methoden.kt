package utils

import DTO.users.Customer
import DTO.users.Operator
import Shop
import customers
import operators

class Methoden {
    fun chekPass(login: String, pass: String): Customer? {
        try {
            return customers.filter { c -> c.login == login && c.checkPass(pass) }.first()
        } catch (ex: Exception) {
            println("this user is not registered")
        }
        return null
    }

    fun checkPassword(): Customer? {
        var check = false
        var retCustomer: Customer? = null
        while (!check) {
            println("Enter your Login")
            var login = readln()
            println("Enter your pasword")
            var password = readln()

            retCustomer = chekPass(login, password)

            if (retCustomer != null) {
                println("User with Login: $login exists")
                check = true
            } else {
                println("login or password does not match. Try again:")
            }
        }
        return retCustomer
    }

    fun addNewUser(customers: MutableList<Customer>, operator: MutableList<Operator>) {
        println("Add new Customer/operator")
        println(
            """
        Change role:
        [1] - Customer
        [2] - Operator
    """.trimIndent()
        )
        var role: Int = readLine()!!.toInt()
        println("Enter your name:")
        var name = readln()
        println("Enter your age:")
        var age = readln().toInt()
        println("Enter login:")
        var login = readln()
        println("Enter password:")
        var password = readln()
        when (role) {
            1 -> customers.add(Customer(name, login, password, age))
            2 -> operators.add(Operator(name, login, password))
        }
    }

    fun showOneCategory(shop: Shop) {
        println("Select a category")
        var index = 0
        for (category in shop.productMap) {

            println("[${index++}] - ${category.key}")
        }

        var choseCategory = readln().toInt()

        shop.showOneCategory(shop.productMap.keys.elementAt(choseCategory))
    }

    fun choseProduct(curentCustomer: Customer?, shop: Shop) {
        var productName = ""
        do {
            if (curentCustomer != null) {
                if (curentCustomer.age < 12) {
                    println("The action is allowed only to users over 12 years old")
                    checkPassword()
                    break
                }
            }
            println("Choose a product - enter its name or Enter \"quit\":")
            productName = readln()
            if (productName == "quit") break
            if (curentCustomer != null) {
                shop.productToBacket(productName, curentCustomer)
            }

        } while (productName != "quit")

        if (curentCustomer != null) {
            curentCustomer.shoppingBasket.print()
        }
        if (curentCustomer != null) {
            println("With Sum: ${curentCustomer.shoppingBasket.busketSum()} Euro\n")
        }
    }

    fun pay(curentCustomer: Customer, shop: Shop) {
        if (curentCustomer.shoppingBasket.productInBasket.isNotEmpty()) {
            println("Pay? yes/no")
            var pay = readln()
            if (pay == "yes") {
                shop.pay(curentCustomer!!)
                this.pay(curentCustomer, shop)
            } else {
                println("payment canceled")
                curentCustomer.shoppingBasket.clear()
            }
        }


    }
}
