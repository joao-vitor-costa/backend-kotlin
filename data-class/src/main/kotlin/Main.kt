fun main() {
    val alex = Pessoa(
        nome = "Alex",
        idade = 25
    )

    val alex2 = alex.copy()

    println(alex == alex2)

    val alex3 = alex2.copy(idade = 26)

    println(alex3)
    println(alex3 ==  alex2)
    
    alex.fala()
    val documento = Documento(
        rg = "14487484-7",
        cpf = "1544.125.254-47"
    )
    val documento2 = Documento(
        rg = "14487484-7",
        cpf = "1544.125.254-47"
    )
    println(documento == documento2)

    println(alex)
    println(documento)

    val (nome, idade) = alex

    println("Nome= $nome")
    println("Idade= $idade")
}


data class Pessoa(val nome: String, val idade: Int) {
    fun fala() {
        println("Olá")
    }

}

data class Documento(val rg: String, val cpf: String) {

}