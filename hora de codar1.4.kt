fun main (){
    //Considerando a figura abaixo, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas. O usuário irá informar os valores de cada variável.

        var base: Double
        var altura: Double
        var lado: Double
        var diag_ma: Double
        var diag_me: Double
        var base_ma: Double
        var base_me: Double
        var h: Double
        var raio: Double

        println("informe a conta que vc deseja realizar ")
        println("1 - quadrado")
        println("2 - rentagulo")
        println("3 - losango")
        println("4 - trapezio")
        println("5 - Paralelograma")
        println("6 - Triangulo")
        println("7 - Círculo")

        when(readln()!!.toInt()){
            1-> {
                println("Informe o valor da base: ")
                base = readln().toDouble()
                println("Informe o valor da altura: ")
                altura = readln().toDouble()
                println("O valor da área será: " + base * altura)
            }
            2-> {
                println("Informe o valor da base: ")
                lado = readln().toDouble()
                println("O valor da área será: " + lado * lado)
            }
            3-> {
                println("Informe o valor da diagonal maior: ")
                diag_ma = readln().toDouble()
                println("Informe o valor da diagonal menor: ")
                diag_me = readln().toDouble()
                println("O valor da área será: " + (diag_ma * diag_me) / 2 )
            }
            4->{
                println("Informe o valor da base maior : ")
                base_ma = readln().toDouble()
                println("Informe o valor da base menor: ")
                base_me = readln().toDouble()
                println("Informe o valor da altura: ")
                h = readln().toDouble()
                println("O valor da área será: " + (base_ma + base_me) / h )
            }
            5->{
                println("Informe o valor da altura: ")
                altura = readln().toDouble()
                println("Informe o valor da base: ")
                base= readln().toDouble()
                println("O valor da área será: " + altura + base)
            }
            6->{
                println("Informe o valor da base: ")
                base = readln().toDouble()
                println("Informe o valor da altura: ")
                altura = readln().toDouble()
                println("O valor da área será: " + (base * altura) / 2 )
            }
            7->{
                println("Informe o seu raio: ")
                raio = readln().toDouble()
                println("O valor da área será: " + (raio * raio) * 3.14  )
            }
        }

    }
