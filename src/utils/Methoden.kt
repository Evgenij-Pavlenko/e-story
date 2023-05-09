package utils

import DTO.users.Customer
import DTO.users.User
import customers

class Methoden {
    fun chekPass(login: String, pass: String): Customer {
        return customers.filter { c -> c.login == login && c.checkPass(pass)}.first()
    }
}
