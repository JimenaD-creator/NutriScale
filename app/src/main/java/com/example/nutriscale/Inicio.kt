package com.example.nutriscale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)
        var next = (findViewById<ImageButton>(R.id.ib_n1))

        // Asignamos el metodo onclic a nuestro imagebutton
        next.setOnClickListener{
            // Mandamos llamar el activity 2
            val activity3 = Intent(this, referencias::class.java)
            startActivity(activity3)
        }

    }
}