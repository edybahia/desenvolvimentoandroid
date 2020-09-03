package com.example.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // abrir a MainActivity após 5 segundos
        Handler(Looper.getMainLooper()).postDelayed(
            {
                val mIntent = Intent (this, MainActivity::class.java)
                startActivity(mIntent)
                finish()

            }, 5000)


    }
}