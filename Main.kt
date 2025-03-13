fun main() {


    println("Digite um número inteiro: ")
    val num = readln()?.toDoubleOrNull()
    println("Digite um número inteiro: ")
    val num2 = readln()?.toDoubleOrNull()
    if (num != null && num2!= null) {
        if (num > num2) {
            println("Seu número maior é: " + num)
        } else {
            println("Seu número maior é: " + num2)
        }
    }


}
