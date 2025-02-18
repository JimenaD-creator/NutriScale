package com.example.nutriscale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.Button
import android.widget.ImageButton

class ejercicios_teen_sobre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicios_teen_sobre)
        var back = (findViewById<ImageButton>(R.id.ib_b15))
        val visorweb = findViewById<WebView>(R.id.web_bajo)
        visorweb.webChromeClient = object: WebChromeClient(){

        }
        val settings: WebSettings = visorweb.settings
        settings.javaScriptEnabled = true
        visorweb.loadUrl("https://youtu.be/XFwTcmUCFFI")
        back.setOnClickListener {
            val act6 = Intent(this, sobrepeso_teenagers::class.java)
            startActivity(act6)
        }
    }
}