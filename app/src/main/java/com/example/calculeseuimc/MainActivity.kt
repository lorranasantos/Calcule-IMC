package com.example.calculeseuimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{

        private lateinit var buttonFeminino: Button
        private lateinit var buttonMasculino: Button
        private lateinit var editPeso: EditText
        private lateinit var editAltura: EditText
        private lateinit var buttonCalcular: Button
        private lateinit var textView_resultado: TextView
        private lateinit var textViewStatus: TextView

//não é a função do onCreate criar calculos
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonFeminino = findViewById(R.id.buttonFeminino)
        buttonFeminino.setOnClickListener(this)

        buttonMasculino = findViewById(R.id.buttonMasculino)
        buttonMasculino.setOnClickListener(this)

        editPeso = findViewById(R.id.editPeso)
        editAltura = findViewById(R.id.editAltura)

        buttonCalcular = findViewById(R.id.buttonCalcular)
        buttonCalcular.setOnClickListener(this)
    }

    //nao pode ter dois metodos com o mesmo nome e assinatura ex. dois onClick
    override fun onClick(v: View) {
        when (v.id) {
            R.id.buttonFeminino -> {
                buttonFeminino.background= getDrawable(R.drawable.cantos_esquerdos_arredondados)
                buttonMasculino.background = getDrawable(R.drawable.cantos_direitos_arredondados)
            }
            R.id.buttonMasculino -> {
                buttonMasculino.background= getDrawable(R.drawable.cantos_direitos_arredondados)
                buttonFeminino.background= getDrawable((R.drawable.cantos_esquerdos_arredondados))

            }
            /*R.id.buttonCalcular -> {
                val intent = Intent(this, ResultadoIMC::class.java)
                startActivity(intent)
            }
            R.id.buttonCalcular ->{
                val imc = calcularIMC(editPeso.text.toString().toDouble(), editAltura.text.toString().toDouble())
                Toast.makeText(this, imc.toString(), Toast.LENGTH_LONG).show()*/

            R.id.buttonCalcular ->{

            val abrirActivityResultadoIMC = Intent(this, ResultadoIMC::class.java)

                abrirActivityResultadoIMC.putExtra("peso", editPeso.text.toString().toDouble())
                abrirActivityResultadoIMC.putExtra("altura", editAltura.text.toString().toDouble())

            startActivity(abrirActivityResultadoIMC)
            }
        }
    }
}