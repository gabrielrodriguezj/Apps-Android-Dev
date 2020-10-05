package com.example.clima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.clima.config.Propiedades
import com.example.clima.response.WeatherResponse
import com.google.gson.Gson
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    private var tvCiudad:TextView? = null
    private var tvGrados:TextView? = null
    private var tvEstatus:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCiudad = findViewById(R.id.tvCiudad)
        tvGrados = findViewById(R.id.tvGrados)
        tvEstatus = findViewById(R.id.tvEstatus)

        val ciudad = intent.getStringExtra("com.example.clima.ciudades.CIUDAD")
        val apiKey = Propiedades.apiKey
        val units = "metric"
        val lang= "es"
        if(Network.conectadoAIntenet(this)){
            //Ejecutar solicitud HTTP
            //api-key: 5c94e2303436e5b64934ebed7e57253c

            val url =
                "${Propiedades.urlGetWeatherByCityId}?id=$ciudad&appid=$apiKey&units=$units&lang=$lang"
            solicitudHTTPVolley(url)
        }
        else{
            //Mostrar mensaje de error
            Toast.makeText(this, "No hay conexión a Internet", Toast.LENGTH_SHORT).show()
        }
    }

    private fun solicitudHTTPVolley(url:String){
        val queue = Volley.newRequestQueue(this)
        val solicitud = StringRequest(Request.Method.GET, url, Response.Listener<String> {
            response ->
            try {
                Log.d("solicitudHTTPVolley", response)

                val gson = Gson()
                val weatherResponse = gson.fromJson(response, WeatherResponse::class.java)

                Log.d("Weather-ciudad", weatherResponse.name)
                Log.d("Weather-temperatura", weatherResponse.main.temp.toString())
                Log.d("Weather-estatus", weatherResponse.weather.get(0).description)

                tvCiudad?.text = weatherResponse.name
                tvGrados?.text = weatherResponse.main.temp.toString() + "°"
                tvEstatus?.text = weatherResponse.weather.get(0).description
            }
            catch (e:Exception){

            }
        }, Response.ErrorListener {

        })

        queue.add(solicitud)
    }
}