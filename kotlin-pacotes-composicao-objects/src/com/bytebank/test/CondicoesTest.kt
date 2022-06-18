package com.bytebank.test

import org.junit.jupiter.api.Test

internal class CondicoesTest {

    @Test
    fun condicoes() {

        val saldo = 0.1

        if (saldo > 0.0) {
            println("conta é positiva")
        } else if (saldo == 0.0) {
            println("conta é neutra")
        } else {
            println("conta é negativa")
        }

        when {
            saldo > 0.0 -> println("conta é positiva")
            saldo == 0.0 -> println("conta é neutra")
            else -> println("conta é negativa")
        }
    }
}