package com.example.nutriscale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class normal_teenagers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_normal_teenagers)
        var back = (findViewById<Button>(R.id.info4))

        // Asignamos el metodo onclic a nuestro imagebutton
        back.setOnClickListener{
            // Mandamos llamar el activity 2
            val act6 = Intent(this, rec_normal_teen::class.java)
            startActivity(act6)
        }
    }
}