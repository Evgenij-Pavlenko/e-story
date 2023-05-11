import DTO.products.Film.Online
import DTO.products.Film.Real
import DTO.products.Film.TypeFilmBox.*
import DTO.products.electronic.Notebook
import DTO.products.electronic.TV
import DTO.users.Customer
import DTO.users.Operator
import utils.Methoden


var customer1 = Customer("Alex Schmidt", "Alex", "Alex123", 18)
var customer2 = Customer("Nikol Stoun", "Nikol", "Nikol123", 11)
var operator1 = Operator("Max Rode", "Max", "Hard123")

var notebook1 = Notebook("Lenovo", 1000.0, 15.0, 1.60)
var notebook2 = Notebook("Dell", 1200.0, 15.4, 1.62)
var tv1 = TV("Samsung", 550.0, 48)
var tv2 = TV("Sharp", 500.0, 44)
var onlineFilm1 = Online("The Matrix", 15.0, "http://e-shop/thematrix")
var onlineFilm2 = Online("Star Wars", 14.99, "http://e-shop/starwars")
var realFilm1 = Real("Hobbit", 20.0, DVD)
var realFilm2 = Real("King of Rings", 19.0, CD)
var realFilm3 = Real("Rembo", 25.0, VHS)

var notebooks = mutableListOf(notebook1, notebook2)
var tvs = mutableListOf(tv1, tv2)
var onlineFilms = mutableListOf(onlineFilm1, onlineFilm2)
var realFilms = mutableListOf(realFilm1, realFilm2, realFilm3)

var customers = mutableListOf(customer1, customer2)
var operators = mutableListOf(operator1)


fun main() {
    var method = Methoden()

    var shop = Shop()

    shop.productMap = mutableMapOf(
        "Notebook" to notebooks.toMutableList(),
        "tv" to tvs.toMutableList(),
        "onlineFilms" to onlineFilms.toMutableList(),
        "realFilms" to realFilms.toMutableList()
    )

    method.addNewUser(customers, operators)

    println("Customers: $customers")
    println("Operators: $operators")

    shop.printProduct()

    var curentCustomer: Customer? = method.checkPassword()

    method.showOneCategory(shop)

    method.choseProduct(curentCustomer, shop)


    if (curentCustomer != null) {
        method.pay(curentCustomer, shop)
    }

    println("Thank you for visiting our store!")


}


