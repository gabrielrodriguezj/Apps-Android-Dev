package com.example.clima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Ciudades : AppCompatActivity() {

    val TAG = "com.example.clima.ciudades.CIUDAD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        val btnChihuahua = findViewById<Button>(R.id.bntClimaChihuahua)
        val btnBerlin = findViewById<Button>(R.id.btnClimaBerlin)

        btnChihuahua.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this, "Chihuahua", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG,"4014338") //Código de openweathermap
            startActivity(intent)
        })

        btnBerlin.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this, "Berlin", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG,"2950159") //Código de openweathermap
            startActivity(intent)
        })
    }
}