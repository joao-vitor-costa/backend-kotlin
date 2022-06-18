fun main(){
    val x: Int = 15
    val y: Double = 14.5
    var z = x
    z += 10

    teste(x)
    teste(y)

    println(x.toDouble())
    println(y.toLong())
    println(z)

}

fun teste(valor: Number){
    println(valor)
}