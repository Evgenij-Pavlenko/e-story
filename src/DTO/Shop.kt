package DTO

import DTO.products.Product
import DTO.users.Customer
import DTO.users.PayMethod
import DTO.users.User

class Shop {

    var productMap: MutableMap<String, MutableList<Product>> = mutableMapOf()
    var productList: MutableList<Product> = mutableListOf()
    var userMap: MutableMap<String, MutableList<User>> = mutableMapOf()
    var customerBacket = Backet()

    fun addProduct(product: Product) {
        var nameProduct = product.javaClass.simpleName
        productMap[nameProduct]?.add(product)
    }

    fun editProduct(product: Product, neueName: String):Boolean {
        // ob alles gut gelaufen ist
        var ret = false
        var nameProduct = product.javaClass.simpleName
        if (productMap[nameProduct]!!.contains(product)) {
            var indexProduct =  productMap[nameProduct]!!.indexOf(product)
            product.name = neueName
            productList = productMap[nameProduct]!!
            productList[indexProduct] = product
           ret = true
        }
        return ret
    }

    fun deleteProduct(product: Product): Boolean {
        var ret = false
        var nameProduct = product.javaClass.simpleName

        if (productMap[nameProduct]!!.contains(product)) {
            productMap[nameProduct]!!.remove(product)
            ret = true
        }
        return ret
    }

    fun printProduct(){
        for (productInMap in productMap){
            println(productInMap.key)
            for (product in productInMap.value){
                println(product)
            }
            println("\n")
        }
    }

    fun productToBacket(productName: String, customer: Customer, payMethod: PayMethod = PayMethod.PayPal){
        for (productInMap in productMap){
            println(productInMap.key)
            for (product in productInMap.value){
                if (product.name == productName){
                    customer.payMethod.keys[payMethod] = customer.payMethod[payMethod.name]?.minus(product.price)
                    customer.shoppingBasket.addInBacket(product)
                    productInMap.value.remove(product)
                }

            }
            println("\n")
        }
    }


}
