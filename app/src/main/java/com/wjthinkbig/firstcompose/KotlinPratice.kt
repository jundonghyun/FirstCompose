package com.wjthinkbig.firstcompose

fun main() {
    enhancedMessage("Hello") {
        print(it)
        sum(1,5)
    }
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun enhancedMessage(message: String, funAsParameter: (String) -> Int) {
    println("$message ${funAsParameter("hey there ")}")
}