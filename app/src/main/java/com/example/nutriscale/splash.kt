package com.example.nutriscale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        // Referenciamos nuestro control de logotipo
        val ivlogo = findViewById<ImageView>(R.id.ivlog)
        val ivtecno = findViewById<TextView>(R.id.iv_tecno)
        val ivslogan = findViewById<TextView>(R.id.iv_slogan)
        // Añadimos animación al logotipo
        val parpadeo = AnimationUtils.loadAnimation(this, R.anim.blink)
        //ivlogo.startAnimation(parpadeo)
        //ivlogo.animate().apply {
        //duration = 4000
        //rotationYBy(360f)
        //}.start()

        ivlogo.animate().apply {
            duration = 4000
            rotationYBy(360f)
        }.start()
        ivtecno.animate().apply {
            duration = 4000
            rotationYBy(360f)
        }.start()
        ivslogan.animate().apply {
            duration = 4000
            rotationYBy(360f)
        }.start()

        // Ocultamos la barra de estado para hacer la aplicacion a pantalla completa
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent (this, Inicio::class.java)
            startActivity(intent)
        }, 4000)
    }
}