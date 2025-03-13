fun main(){
    println("Digite um número inteiro: ")
    val num = readln()?.toDoubleOrNull()
    println("Digite um número inteiro: ")
    val num2 = readln()?.toDoubleOrNull()
    println("Digite um número inteiro: ")
    val num3 = readln()?.toDoubleOrNull()
    if (num != null && num2!= null && num3!=null){
        if(num > num2 && num > num3){
            println("Seu número maior é: " + num)
        }
        else if (num2>num && num2>num3){
            println("Seu número maior é: " + num2)
        }
        else {
            println("Seu número maior é: " + num3)
        }
    }

}