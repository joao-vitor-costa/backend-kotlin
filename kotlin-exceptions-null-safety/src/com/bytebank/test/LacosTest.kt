package com.bytebank.test

import org.junit.jupiter.api.Test

internal class LacosTest {

    @Test
    fun lacos() {
        var i = 0
        while (i < 5) {
            val titular: String = "Alex $i"
            val numeroConta: Int = 1000 + i
            var saldo = i + 10.0

            println("titular $titular")
            println("número da conta $numeroConta")
            println("saldo da conta $saldo")
            println()
            i++
        }

        for (i in 5 downTo 1) {
            val titular: String = "Alex $i"
            val numeroConta: Int = 1000 + i
            var saldo = i + 10.0

            println("titular $titular")
            println("número da conta $numeroConta")
            println("saldo da conta $saldo")
            println()
        }
    }
}