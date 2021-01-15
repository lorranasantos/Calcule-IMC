package com.example.calculeseuimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.calculeseuimc.util.calcularIMC

class ResultadoIMC : AppCompatActivity() {

    private lateinit var textView_resultado: TextView
    private lateinit var textViewStatus: TextView
    private lateinit var textViewFrase:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_i_m_c)

        textView_resultado = findViewById<TextView>(R.id.textView_resultado)
        textViewStatus = findViewById<TextView>(R.id.textViewStatus)
        textViewFrase = findViewById(R.id.textViewFrase)

        exibirresultado();
    }
    private fun exibirresultado(){
        val resultado = calcularIMC(
            intent.getDoubleExtra("peso", 0.0),
            intent.getDoubleExtra("altura", 0.0)
        )
        textView_resultado.text = resultado[0]
        textViewStatus.text = resultado[1]
        textViewFrase.text = resultado[2]
    }
}