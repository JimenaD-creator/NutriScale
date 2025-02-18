package com.example.nutriscale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.ImageButton

class rec_normal_children : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rec_normal_children)
        var back = (findViewById<ImageButton>(R.id.ib_b30))
        val visorweb = findViewById<WebView>(R.id.web_rec)
        visorweb.webChromeClient = object: WebChromeClient(){

        }
        val settings: WebSettings = visorweb.settings
        settings.javaScriptEnabled = true
        visorweb.loadUrl("https://dayamineral.pe/por-que-es-importante-para-mi-hijo-mantenerse-en-un-peso-saludable/.")
        back.setOnClickListener {
            val act6 = Intent(this, referencias::class.java)
            startActivity(act6)
        }
    }
}