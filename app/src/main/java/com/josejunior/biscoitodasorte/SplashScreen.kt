package com.josejunior.biscoitodasorte

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.josejunior.biscoitodasorte.databinding.ActivitySplashScreenBinding

class SplashScreen : AppCompatActivity() {
    private lateinit var b: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(b.root)

        val m = Intent(this, MainActivity::class.java)

        Handler(Looper.getMainLooper()).postDelayed({startActivity(m); finish()},4000)

    }
}