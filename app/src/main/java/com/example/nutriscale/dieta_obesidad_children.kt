package com.example.nutriscale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.Button
import android.widget.ImageButton

class dieta_obesidad_children : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dieta_obesidad_children)
        var back = (findViewById<ImageButton>(R.id.ib_b19))
        val visorweb = findViewById<WebView>(R.id.web_bajo)
        visorweb.webChromeClient = object: WebChromeClient(){

        }
        val settings: WebSettings = visorweb.settings
        settings.javaScriptEnabled = true
        visorweb.loadUrl("https://middlesexhealth.org/learning-center/espanol/preguntas-y-respuestas/sobrepeso-en-beb-s-cu-ndo-es-una-causa-de-preocupaci-n")
        back.setOnClickListener {
            val act6 = Intent(this, obesidad_children::class.java)
            startActivity(act6)
        }
    }
}