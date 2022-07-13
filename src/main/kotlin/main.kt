fun main() {
    println("Bem vindo ao Bytebank")

    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.saldo = 200.00

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 100.00
    println(contaFran.titular)
    println(contaFran.saldo)
    println(contaAlex.titular)
    println(contaAlex.saldo)

    println("Depositando conta Alex")
    deposita(contaAlex, 50.00)
    println(contaAlex.saldo)
    deposita(contaFran, 70.00)
    println("Depositando conta Fran")
    println(contaFran.saldo)
}

fun deposita(conta: Conta, valor : Double){
    conta.saldo += valor
}
class Conta{
    var titular = ""
    var numero = 0
    var saldo = 0.00
}

fun testaCopiasReferencias(){

    val numeroX = 10
    var numeroY = numeroX
    numeroY ++

    println(numeroX)
    println(numeroY)

    val contaJoao = Conta()
    contaJoao.titular = "Joao"

    var contaMaria = contaJoao
    contaMaria.titular = "maria"

    println("conta joão ${contaJoao.titular}")
    println("conta maria ${contaMaria.titular}")
    println(contaJoao)
    println(contaMaria)
}
fun testaLacos(){
    var i = 0
    while (i < 5) {
        i++
        val titular: String = "Leticia"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.00

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo: $saldo")
        println()
    }

    for (i in 1..5) {
        //Var é variável e Val não

        val titular: String = "Leticia"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.00

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo: $saldo")
        println()

//    testaCondicoes(saldo)

    }
//    for (i in 5 downTo 1 step 2) {
//        if (i == 4) {
//            break
//        }else{
//            continue -> pular
//        }
//        println(i)
//    }
    //cria apenas 4 contas do 1 até 4
//    for (i in 1 until 5) {
//    }
}
fun testaCondicoes(saldo: Double) {
    /*if (saldo > 0){
        println("A conta é positiva")
    }else if (saldo == 0.0){
        println("A conta é neutra")
    }else{
        println("A conta é neutra")
    }*/
    //When é parecido com o switch case
    when {
        saldo > 0 -> println("A conta é positiva")
        saldo == 0.0 -> println("A conta é negativa")
        else -> println("A conta é negativa")
    }
}