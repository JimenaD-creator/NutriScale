package com.example.nutriscale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class sobrepeso_babies : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobrepeso_babies)
        var back = findViewById<ImageButton>(R.id.ib_regresar12)
        var dieta = (findViewById<Button>(R.id.b2))
        var ejercicios = (findViewById<Button>(R.id.btn_e1))
        dieta.setOnClickListener{
            // Mandamos llamar el activity 2
            val act6 = Intent(this, dieta_baby_sobre::class.java)
            startActivity(act6)
        }
        ejercicios.setOnClickListener {
            val act7 = Intent(this, ejercicios_babies_sobre::class.java)
            startActivity(act7)

        }
        back.setOnClickListener{
            val act6 = Intent(this, referencias::class.java)
            startActivity(act6)
        }
    }
}