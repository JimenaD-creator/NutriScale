package com.example.nutriscale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.ImageButton

class rec_normal_kids : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rec_normal_kids)
        var back = (findViewById<ImageButton>(R.id.ib_b31))
        val visorweb = findViewById<WebView>(R.id.web_rec)
        visorweb.webChromeClient = object: WebChromeClient(){

        }
        val settings: WebSettings = visorweb.settings
        settings.javaScriptEnabled = true
        visorweb.loadUrl("https://www.pastasdoria.com/vive-con-doria/alimentacion-y-desempeno/peso-saludable-por-que-es-importante-y-como-lograrlo-en-los-ninos#:~:text=%C2%BFPor%20qu%C3%A9%20es%20importante%20que,de%20vida%20se%20ve%20afectada%3A&text=Tienen%20m%C3%A1s%20posibilidades%20de%20sufrir,por%20parte%20de%20sus%20compa%C3%B1eros.")
        back.setOnClickListener {
            val act6 = Intent(this, referencias::class.java)
            startActivity(act6)
        }
    }
}