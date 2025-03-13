fun main() {
    var maior1:Int
    var maior2:Int
    var v1:Int
    var v2:Int
    var v3:Int

    println("Digite o 1º número inteiro: ")
    v1 = readln().toInt()
    println("Digite o 2º número inteiro: ")
    v2 = readln().toInt()
    println("Digite o 3º número inteiro: ")
    v3 = readln().toInt()


        if (v1 > v2 && v1 > v3) {
             maior1 = v1

            if (v2 > v3) {
                 maior2 = v2
            } else {
                maior2 = v3
            }
        } else {
             maior1 = v3
        }
        if (v1 > v2) {  maior2 = v1 }

        else {  maior2 = v2 }


        println("A soma dos maiores são: " +(maior1 + maior2))
    }
