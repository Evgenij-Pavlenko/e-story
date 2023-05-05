package DTO.users

open class User{
    var name: String = ""
    var login: String = ""
    private var password: String? = null

    constructor(name: String, login: String, password: String?) {
        this.name = name
        this.login = login
        this.password = password
    }
}