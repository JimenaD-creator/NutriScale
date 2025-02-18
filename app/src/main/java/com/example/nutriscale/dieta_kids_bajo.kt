package com.example.nutriscale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.ImageButton

class dieta_kids_bajo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dieta_kids_bajo)
        var back = (findViewById<ImageButton>(R.id.ib_b7))
        //Referenciar nuestros controles
        val visorweb = findViewById<WebView>(R.id.web_bajo)
        visorweb.webChromeClient = object: WebChromeClient(){

        }
        val settings: WebSettings = visorweb.settings
        settings.javaScriptEnabled = true
        visorweb.loadUrl("https://www.guiainfantil.com/alimentacion/dietas/idea-de-menu-semanal-para-ninos-con-bajo-peso-pautas-de-alimentacion/")
        back.setOnClickListener {
            val act6 = Intent(this, bajo_kids::class.java)
            startActivity(act6)
        }
    }
}