package com.example.calculeseuimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.example.calculeseuimc.R.*

class MenuActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var cardImc: CardView
    private lateinit var cardNcd: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_menu)

        cardImc = this.findViewById(R.id.card_imc)
        cardNcd = findViewById(R.id.cardNcd)
        cardImc.setOnClickListener(this)
        cardNcd.setOnClickListener(this)
        supportActionBar!!.hide()//Double bang

    }

    override fun onClick(v: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

        if (v.id == R.id.cardNcd) {
            val intentNCD = Intent(this, NCDActivity::class.java)
            startActivity(intentNCD)
        } else if (v.id == R.id.card_imc) {
            val intentIMC = Intent(this, ImcActivity::class.java)
            startActivity(intentIMC)
        } else {
            Toast.makeText()
        }
    }
}