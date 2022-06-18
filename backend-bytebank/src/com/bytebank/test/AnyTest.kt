package com.bytebank.test

import com.bytebank.model.Endereco
import org.junit.jupiter.api.Test

class AnyTest {

    @Test
    fun any() {
        val endereco = Endereco(
            logradouro = "Rua vergueiro",
            complemento = "Alura",
            cep = "00000-0700"
        )
        val enderecoNovo = Endereco(
            logradouro = "Rua vergueiro",
            complemento = "Alura",
            cep = "00000-0700"
        )

        println(endereco.equals(enderecoNovo))

        println(endereco.hashCode())
        println(enderecoNovo.hashCode())

        println(endereco)
        println(enderecoNovo)

        println(
            "${endereco.javaClass}@${
                Integer.toHexString(endereco.hashCode())
            }"
        )
    }
}