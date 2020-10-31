package com.example.contactos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

class Detalle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)

        val toolbar = findViewById<Toolbar>(R.id.tbContactos)
        setSupportActionBar(toolbar)

        var actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        val index = intent.getIntExtra("ID", -1)
        val contacto = MainActivity.obtenerContacto(index)

        val tvNombre = findViewById<TextView>(R.id.tvNombreDtl)
        val tvEmpresa = findViewById<TextView>(R.id.tvEmpresaDtl)
        val tvEdad = findViewById<TextView>(R.id.tvEdadDtl)
        val tvPeso = findViewById<TextView>(R.id.tvPesoDtl)
        val tvTelefono = findViewById<TextView>(R.id.tvTelefonoDtl)
        val tvEmail = findViewById<TextView>(R.id.tvEmailDtl)
        val tvDireccion = findViewById<TextView>(R.id.tvDireccionDtl)

        tvNombre.text = contacto.nombre + " " + contacto.apellidos
        tvEmpresa.text = contacto.empresa
        tvEdad.text = contacto.edad.toString() + " años"
        tvPeso.text = contacto.peso.toString() + " Kg."
        tvTelefono.text = contacto.telefono
        tvEmail.text = contacto.empresa
        tvDireccion.text = contacto.direccion
    }
}