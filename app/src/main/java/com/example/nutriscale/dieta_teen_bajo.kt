package com.example.nutriscale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.Button
import android.widget.ImageButton

class dieta_teen_bajo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dieta_teen_bajo)
        var back = (findViewById<ImageButton>(R.id.ib_b8))
        val visorweb = findViewById<WebView>(R.id.web_bajo)
        visorweb.webChromeClient = object: WebChromeClient(){

        }
        val settings: WebSettings = visorweb.settings
        settings.javaScriptEnabled = true
        visorweb.loadUrl("https://www.dietistasnutricionistas.es/menu-semanal-para-ganar-peso/")
        back.setOnClickListener {
            val act6 = Intent(this, bajo_teenagers::class.java)
            startActivity(act6)
        }
    }
}