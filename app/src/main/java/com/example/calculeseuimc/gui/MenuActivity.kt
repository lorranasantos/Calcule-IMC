package com.example.calculeseuimc.gui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.example.calculeseuimc.R

class MenuActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var cardImc: CardView
    private lateinit var cardNcd: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        cardImc = findViewById(R.id.card_imc)
        cardImc.setOnClickListener(this)

        cardNcd = findViewById(R.id.card_ncd)
        cardNcd.setOnClickListener(this)

        supportActionBar!!.hide()//Double bang

    }

    override fun onClick(v: View) {
        //val intent = Intent(this, MainActivity::class.java)
        //startActivity(intent)

        if (v.id == R.id.card_imc) {
            val intentIMC = Intent(this, MainActivity::class.java)
            startActivity(intentIMC)
        } else
        if (v.id == R.id.card_ncd) {
            val intentNCD = Intent(this, NCDActivity::class.java)
            startActivity(intentNCD)
        } else {
            Toast.makeText(this, "Nada foi clicado", Toast.LENGTH_SHORT).show()
        }
    }
}











