package com.example.calculeseuimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.calculeseuimc.util.calcularIMC
import kotlinx.android.synthetic.main.activity_n_c_d.*
import kotlin.math.log

class NCDActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_n_c_d)
        supportActionBar!!.hide() // !! Double bang

        button_calcular.setOnClickListener{
            calcularNCD("F", spinneridade. selectedItemPosition + 1, spinnerAtividade.selectedItem.toString())
        }
    }
}