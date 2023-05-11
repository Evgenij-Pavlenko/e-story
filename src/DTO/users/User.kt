package DTO.users

open class User {
    var name: String = ""
    var login: String = ""
    private var password: String? = null

    constructor(name: String, login: String, password: String?) {
        this.name = name
        this.login = login
        this.password = password
    }

    override fun toString(): String {
        return "Name: ${this.name}, Login: ${this.login}"
    }

    fun checkPass(password: String): Boolean {
        return this.password == password
    }
}