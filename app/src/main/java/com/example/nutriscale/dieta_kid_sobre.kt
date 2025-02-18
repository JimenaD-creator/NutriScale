package com.example.nutriscale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.Button
import android.widget.ImageButton

class dieta_kid_sobre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dieta_kid_sobre)
        var back = (findViewById<ImageButton>(R.id.ib_b6))

        back.setOnClickListener {
            val act6 = Intent(this, sobrepeso_kids::class.java)
            startActivity(act6)
        }
        val visorweb = findViewById<WebView>(R.id.web_sobre)
        visorweb.webChromeClient = object: WebChromeClient(){

        }
        val settings: WebSettings = visorweb.settings
        settings.javaScriptEnabled = true
        visorweb.loadUrl("https://www.clubfamilias.com/es/pautas-alimentacion-menu-sobrepeso")
    }
}