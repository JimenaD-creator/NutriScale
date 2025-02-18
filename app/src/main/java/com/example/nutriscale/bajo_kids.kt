package com.example.nutriscale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class bajo_kids : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bajo_kids)
        var back = findViewById<ImageButton>(R.id.ib_regresar3)
        var dieta = (findViewById<Button>(R.id.b1))
        dieta.setOnClickListener{
            // Mandamos llamar el activity 2
            val act6 = Intent(this, dieta_kids_bajo::class.java)
            startActivity(act6)
        }
        back.setOnClickListener{
            val act6 = Intent(this, referencias::class.java)
            startActivity(act6)
        }

    }
}