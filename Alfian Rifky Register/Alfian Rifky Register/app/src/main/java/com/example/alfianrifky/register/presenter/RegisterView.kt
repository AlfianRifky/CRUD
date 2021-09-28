package com.example.alfianrifky.register.presenter

interface RegisterView {
    fun onSuccessRegister(msg : String?)
    fun onErrorRegister(msg : String?)
}