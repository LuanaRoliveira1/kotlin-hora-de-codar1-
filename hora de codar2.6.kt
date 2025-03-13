fun main(){
    var v1: Int
    var v2: Int
    var v3: Int
    var v4: Int
    var maior: Int

    println("Digite o 1º número inteiro: ")
    v1 = readln().toInt()
    println("Digite o 2º número inteiro: ")
    v2 = readln().toInt()
    println("Digite o 3º número inteiro: ")
    v3 = readln().toInt()
    println("Digite o 4º número inteiro: ")
    v4 = readln().toInt()

    maior = v1
    if(v2>maior){
        maior = v2
    }
    if(v3>maior){
        maior = v3
    }
    if(v4>maior){
        maior = v4
    }
    println("Seu primeiro número é: " + v1)
    println("Seu último número é: " + v4)
    println("Seu número maior é: " + maior)
}