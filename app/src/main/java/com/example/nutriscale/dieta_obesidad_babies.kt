package com.example.nutriscale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.Button
import android.widget.ImageButton

class dieta_obesidad_babies : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dieta_obesidad_babies)
        var back = (findViewById<ImageButton>(R.id.ib_b20))
        val visorweb = findViewById<WebView>(R.id.web_bajo)
        visorweb.webChromeClient = object: WebChromeClient(){

        }
        val settings: WebSettings = visorweb.settings
        settings.javaScriptEnabled = true
        visorweb.loadUrl("https://www.enfabebe.com.mx/mas-de-12-meses?gclid=Cj0KCQjwi46iBhDyARIsAE3nVrZpYLJFdbVySag87bRostWDTpigMyMgaVqwkWgJs7F9P4lni9kXzcEaApJxEALw_wcB&gclsrc=aw.ds")
        back.setOnClickListener {
            val act6 = Intent(this, obesidad_babies::class.java)
            startActivity(act6)
        }
    }
}