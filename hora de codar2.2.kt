fun main(){
    println("Digite um número: ")
    val num = readln()?.toDoubleOrNull()
     if(num != null){
         if(num > 0){
             println("Seu número é positivo.")
         }else if (num < 0){
             println("Seu número é negativo.")
         }
         else{
             println("Seu número é zero.")
         }
     }
}