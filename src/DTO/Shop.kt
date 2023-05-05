package DTO

import DTO.products.Product
import DTO.users.User

class Shop {
    var productList: MutableList<MutableList<Product>> = mutableListOf()
    var userList: MutableList<MutableList<User>> = mutableListOf()
    var customerBacket = Backet()
}