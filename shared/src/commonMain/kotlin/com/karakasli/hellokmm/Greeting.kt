package com.karakasli.hellokmm

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}