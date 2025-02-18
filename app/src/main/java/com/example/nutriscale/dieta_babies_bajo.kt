package com.example.nutriscale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.ImageButton

class dieta_babies_bajo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dieta_babies_bajo)
        //Referenciar nuestros controles
        val visorweb = findViewById<WebView>(R.id.web_bajo)
        val visor = findViewById<WebView>(R.id.web1)
        visorweb.webChromeClient = object: WebChromeClient(){

        }
        val settings: WebSettings = visorweb.settings
        settings.javaScriptEnabled = true
        visorweb.loadUrl("https://www.innatia.com/s/c-dietas-para-ninos/a-comidas-bebes-bajo-peso.html")

        visor.webChromeClient = object : WebChromeClient(){

        }
        val sett: WebSettings = visor.settings
        settings.javaScriptEnabled = true
        visor.loadUrl("https://www.univision.com/estilo-de-vida/madres/tu-bebe-necesita-aumentar-de-peso-los-alimentos-que-podrian-ayudarlo")


        var back = (findViewById<ImageButton>(R.id.ib_b4))
        back.setOnClickListener {
            val act6 = Intent(this, bajo_babies::class.java)
            startActivity(act6)
        }
    }
}