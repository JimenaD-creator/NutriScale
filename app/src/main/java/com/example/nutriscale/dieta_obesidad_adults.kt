package com.example.nutriscale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.ImageButton

class dieta_obesidad_adults : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dieta_obesidad_adults)
        var back = (findViewById<ImageButton>(R.id.ib_b26))
        val visorweb = findViewById<WebView>(R.id.web_bajo)
        visorweb.webChromeClient = object: WebChromeClient(){

        }
        val settings: WebSettings = visorweb.settings
        settings.javaScriptEnabled = true
        visorweb.loadUrl("https://encolombia.com/libreria-digital/lmedicina/obesidad-carta/obesicart-gc-capitulo14a/")
        back.setOnClickListener {
            val act6 = Intent(this, obesidad_adults::class.java)
            startActivity(act6)
        }
    }
}