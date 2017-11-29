package com.anies.kithub

sealed class Authentication {
    data class Token(val token: String) : Authentication()
    object Anonymous : Authentication()
    data class Basic(val username: String, val password: String)
}
