package com.example.calculeseuimc.gui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.calculeseuimc.R

class MainActivity : AppCompatActivity(), View.OnClickListener{

        private lateinit var buttonFeminino: Button
        private lateinit var buttonMasculino: Button
        private lateinit var editPeso: EditText
        private lateinit var editAltura: EditText
        private lateinit var buttonCalcular: Button


//não é a função do onCreate criar calculos
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonFeminino = findViewById(R.id.button_feminino)
        buttonFeminino.setOnClickListener(this)

        buttonMasculino = findViewById(R.id.button_masculino)
        buttonMasculino.setOnClickListener(this)

        editPeso = findViewById(R.id.edit_peso)
        editAltura = findViewById(R.id.edit_altura)

        buttonCalcular = findViewById(R.id.button_calcular_imc)
        buttonCalcular.setOnClickListener(this)
    }

    //nao pode ter dois metodos com o mesmo nome e assinatura ex. dois onClick
    override fun onClick(v: View) {
        when (v.id) {
            R.id.button_feminino -> {
                buttonFeminino.background= getDrawable(R.drawable.cantos_esquerdos_arredondados2)
                buttonMasculino.background = getDrawable(R.drawable.cantos_direitos_arredondados)
            }
            R.id.button_masculino -> {
                buttonMasculino.background= getDrawable(R.drawable.cantos_direitos_arredondados2)
                buttonFeminino.background= getDrawable((R.drawable.cantos_esquerdos_arredondados))

            }
            /*R.id.buttonCalcular -> {
                val intent = Intent(this, ResultadoIMC::class.java)
                startActivity(intent)
            }
            R.id.buttonCalcular ->{
                val imc = calcularIMC(editPeso.text.toString().toDouble(), editAltura.text.toString().toDouble())
                Toast.makeText(this, imc.toString(), Toast.LENGTH_LONG).show()*/

            R.id.button_calcular_imc ->{

            val abrirActivityResultadoIMC = Intent(this, ResultadoIMC::class.java)

                abrirActivityResultadoIMC.putExtra("edit_peso", editPeso.text.toString().toDouble())
                abrirActivityResultadoIMC.putExtra("edit_altura", editAltura.text.toString().toDouble())

            startActivity(abrirActivityResultadoIMC)
            }
        }
    }
}