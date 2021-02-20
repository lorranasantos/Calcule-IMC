package com.example.calculeseuimc.gui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculeseuimc.R
import com.example.calculeseuimc.util.calcularNCD
import kotlinx.android.synthetic.main.activity_n_c_d.*

class NCDActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_n_c_d)
        supportActionBar!!.hide() // !! Double bang

        button_calcular_ncd.setOnClickListener{
            spinner_idade.selectedItemId
        }
    }


}