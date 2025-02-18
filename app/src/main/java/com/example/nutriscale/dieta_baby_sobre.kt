package com.example.nutriscale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.Button
import android.widget.ImageButton

class dieta_baby_sobre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dieta_baby_sobre)
        val visorweb = findViewById<WebView>(R.id.web_sobre)
        visorweb.webChromeClient = object: WebChromeClient(){

        }
        val settings: WebSettings = visorweb.settings
        settings.javaScriptEnabled = true
        visorweb.loadUrl("https://www.enfabebe.com.mx/mas-de-12-meses?gclid=Cj0KCQjwi46iBhDyARIsAE3nVrZpYLJFdbVySag87bRostWDTpigMyMgaVqwkWgJs7F9P4lni9kXzcEaApJxEALw_wcB&gclsrc=aw.ds")
        var back = (findViewById<ImageButton>(R.id.ib_b5))
        back.setOnClickListener {
            val act6 = Intent(this, sobrepeso_babies::class.java)
            startActivity(act6)
        }
    }
}