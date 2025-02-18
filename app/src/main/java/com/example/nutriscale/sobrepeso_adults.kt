package com.example.nutriscale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class sobrepeso_adults : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobrepeso_adults)
        var back = findViewById<ImageButton>(R.id.ib_regresar14)
        var dieta = (findViewById<Button>(R.id.b3))
        var ejercicios = (findViewById<Button>(R.id.btn_e8))
        dieta.setOnClickListener{
            // Mandamos llamar el activity 2
            val act6 = Intent(this, dieta_adults_sobre::class.java)
            startActivity(act6)
        }
        ejercicios.setOnClickListener {
            val act7 = Intent(this, ejercicios_adults_sobre::class.java)
            startActivity(act7)

        }
        back.setOnClickListener{
            val act6 = Intent(this, referencias::class.java)
            startActivity(act6)
        }
    }
}