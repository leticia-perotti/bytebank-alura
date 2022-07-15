fun main() {
    println("Bem vindo ao Bytebank")

    val contaAlex = Conta(titular = "Alex", numero = 1000)
    contaAlex.deposita(200.00)

    val contaFran = Conta(numero =1001, titular = "Fran")

    contaFran.deposita(100.00)
    println(contaFran.titular)
    println(contaFran.saldo)
    println(contaAlex.titular)
    println(contaAlex.saldo)

    println("Depositando conta Alex")
    contaAlex.deposita(50.00)
    println(contaAlex.saldo)
    contaFran.deposita(70.00)
    println("Depositando conta Fran")
    println(contaFran.saldo)

    println("Sacando conta Alex")
    contaAlex.saca(100.00)
    println(contaAlex.saldo)

    println("Transferência")
    if(contaFran.transfere(10.00, contaAlex)){
        println("Transferencia com sucesso")
    }else{
        println("falso")
    }
    println(contaAlex.saldo)
    println(contaFran.saldo)
}
class Conta(
    val titular: String,
    val numero: Int
    ){

    var saldo = 0.00
        private set

    /*constructor(titular: String, numero: Int){
        this.titular = titular
        this.numero = numero
    }*/
    fun deposita(valor : Double){
        if(valor> 0) {
            saldo += valor
        }
    }
    fun saca(valor: Double){
        if(this.saldo >= valor){
            saldo -= valor
        }else{
            println("Não foi possivel efetuar o saque")
        }
    }
    fun transfere(valor: Double, destino: Conta): Boolean{
        if (saldo >= valor){
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }


    /*fun getSaldo(): Double{
        return saldo
    }
    fun setSaldo(valor: Double){
        if(valor > 0) {
            saldo = valor
        }
    }*/
}

fun testaCopiasReferencias(){

    val numeroX = 10
    var numeroY = numeroX
    numeroY ++

    println(numeroX)
    println(numeroY)

    val contaJoao = Conta("Joao", 1002)

    var contaMaria = Conta("Maria", 1003)


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