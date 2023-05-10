package utils

import DTO.users.Customer
import DTO.users.User
import customers

class Methoden {
    fun chekPass(login: String, pass: String): Customer? {
        try {
            return customers.filter { c -> c.login == login && c.checkPass(pass) }.first()
        } catch (ex: Exception) {
            println("this user is not registered")
        }
        return null
    }
}
