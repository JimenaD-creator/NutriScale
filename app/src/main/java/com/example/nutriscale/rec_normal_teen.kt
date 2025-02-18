package com.example.nutriscale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.ImageButton

class rec_normal_teen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rec_normal_teen)
        var back = (findViewById<ImageButton>(R.id.ib_b32))
        val visorweb = findViewById<WebView>(R.id.web_rec)
        visorweb.webChromeClient = object: WebChromeClient(){

        }
        val settings: WebSettings = visorweb.settings
        settings.javaScriptEnabled = true
        visorweb.loadUrl("https://medlineplus.gov/spanish/weightcontrol.html")
        back.setOnClickListener {
            val act6 = Intent(this, referencias::class.java)
            startActivity(act6)
        }
    }
}