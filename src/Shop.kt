import DTO.products.Product
import DTO.users.Customer
import DTO.users.PayMethod
import DTO.users.User

class Shop {

    var productMap: MutableMap<String, MutableList<Product>> = mutableMapOf()
    var productList: MutableList<Product> = mutableListOf()
    var userMap: MutableMap<String, MutableList<User>> = mutableMapOf()

    fun addProduct(product: Product) {
        var nameProduct = product.javaClass.simpleName
        productMap[nameProduct]?.add(product)
    }

    fun editProduct(product: Product, neueName: String): Boolean {
        // ob alles gut gelaufen ist
        var ret = false
        var nameProduct = product.javaClass.simpleName
        if (productMap[nameProduct]!!.contains(product)) {
            var indexProduct = productMap[nameProduct]!!.indexOf(product)
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

    fun printProduct() {
        println("\nProducts in Shop:\n")
        for (productInMap in productMap) {
            println(productInMap.key)
            for (product in productInMap.value) {
                println(product)
            }
            println("\n")
        }
    }

    fun productToBacket(productName: String, customer: Customer) {
        for (productInMap in productMap) {

            for (product in productInMap.value) {
                if (product.name.lowercase() == productName.lowercase()) {
                    customer.shoppingBasket.addInBasket(product)
                    productInMap.value.remove(product)
                    break
                }
            }
        }
        printProduct()
    }

    fun pay(customer: Customer): Boolean {
        var checkBacketAgain = false
        if (customer.payMethod[PayMethod.PayPal]!! >= customer.shoppingBasket.busketSum()) {
            customer.payMethod[PayMethod.PayPal] =
                customer.payMethod[PayMethod.PayPal]!! - customer.shoppingBasket.busketSum()
            customer.shoppingBasket.print()
            println("\t has been purchased")
        } else {
            var different = customer.shoppingBasket.busketSum() - customer.payMethod[PayMethod.PayPal]!!
            while (different > 0.0) {
                println("not enough funds on the account. Not enough $different Euro")
                println("remove excess from the Backet:")
                different -= customer.shoppingBasket.deleteFromBasket(this)
                if (different <= 0.0) {
                    checkBacketAgain = true
                }

            }
        }
        println("Customer geld: ${customer.payMethod[PayMethod.PayPal]}")
        if (!checkBacketAgain) {
            customer.shoppingBasket.clear()
            if (customer.shoppingBasket.productInBasket.isEmpty()) {
                println("Backet is Empty")
            }
        }

        customer.shoppingBasket.print()
        return checkBacketAgain
    }

    fun showOneCategory(nameCategory: String) {
        for (category in productMap) {

            if (category.key == nameCategory)
                for (product in category.value) {
                    println(product)
                }
        }
    }


}
