package com.example.calculeseuimc.gui

import android.content.Intent
import android.os.Bundle
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.calculeseuimc.R

class splash: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        android.os.Handler(Looper.getMainLooper()).postDelayed({

            val abrirActivityMain = Intent(this, MenuActivity::class.java)
            startActivity(abrirActivityMain)
            finish()

        }, 3000 )
    }
}