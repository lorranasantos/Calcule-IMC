package com.example.calculeseuimc.gui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.calculeseuimc.R
import com.example.calculeseuimc.util.calcularIMC

class ResultadoIMC : AppCompatActivity() {

    private lateinit var textViewResultado: TextView
    private lateinit var textViewStatus: TextView
    private lateinit var textViewFrase:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_i_m_c)

        textViewResultado = findViewById(R.id.text_view_resultado)
        textViewStatus = findViewById(R.id.text_view_status)
        textViewFrase = findViewById(R.id.text_view_frase)

        exibirResultado()
    }
    private fun exibirResultado(){
        val resultado = calcularIMC(
            intent.getDoubleExtra("edit_peso", 0.0),
            intent.getDoubleExtra("edit_altura", 0.0)
        )
        textViewResultado.text = resultado[0]
        textViewStatus.text = resultado[1]
        textViewFrase.text = resultado[2]
    }
}