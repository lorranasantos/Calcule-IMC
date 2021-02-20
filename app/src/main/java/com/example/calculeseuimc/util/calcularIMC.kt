package com.example.calculeseuimc.util

import com.example.calculeseuimc.repository.frases
import java.text.DecimalFormat
import kotlin.random.Random
import kotlin.String as String

fun calcularIMC (peso: Double, altura: Double): Array<String > {

    val imc = peso / Math.pow(altura, 2.0)
    val status = obterStatus(imc)

    return arrayOf(formatarDouble(imc), status, obterFrase(status))

}

fun obterFrase(status: String ): String  {
    var tamanho = 0

    if (status == "Peso Ideal"){
         tamanho = frases.frasesIdeal.size
        return frases.frasesIdeal[java.util.Random().nextInt(tamanho)]
    }
    else{
         tamanho = frases.frasesNaoIdeal.size
        return frases.frasesNaoIdeal[java.util.Random().nextInt(tamanho)]
    }

}


fun formatarDouble(valor: Double): String{

    val df = DecimalFormat("##,###.0")
    return df.format(valor)
}

    fun obterStatus(imc: Double): String  {

        if(imc < 18.5){
            return "Abaixo do Peso"
        }
        else if (imc >= 18.5 && imc < 25){
            return "Peso Ideal"
        }
        else if(imc >= 25 && imc < 30){
            return "Levemente acima do Peso"
        }
        else if (imc >= 30 && imc <35){
            return "obesidade grau I"
        }
        else if (imc >= 35 && imc < 40){
            return "obesidade grau II"
        }
        else{
            return "obesidade grau III"
        }
    }