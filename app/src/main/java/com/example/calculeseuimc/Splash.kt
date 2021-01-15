package com.example.calculeseuimc

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import java.util.logging.Handler

class splash : AppCompatActivity() {
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