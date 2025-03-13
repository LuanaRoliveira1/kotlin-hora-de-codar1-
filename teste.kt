fun main() {
    var maior1:Int
    var maior2:Int

    println("Digite o 1º número inteiro: ")
    val v1 = readln()?.toInt()
    println("Digite o 2º número inteiro: ")
    val v2 = readln()?.toInt()
    println("Digite o 3º número inteiro: ")
    val v3 = readln()?.toInt()


    if (v1 != null && v2 != null && v3 != null) {

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


        println("A soma dos maiores são: " +maior1 + maior2)
    }
}