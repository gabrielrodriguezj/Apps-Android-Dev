package com.example.contactos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ListView
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    companion object{
        var contactos:ArrayList<Contacto>? = null

        fun obtenerContacto(index:Int) : Contacto{
            return contactos?.get(index)!!
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.tbContactos)
        setSupportActionBar(toolbar)

        contactos = ArrayList()
        contactos?.add(Contacto("Gabriel", "Rodríguez", "DZ", 25, 98.2F, "México", "9999999999", "test@test.com", R.drawable.foto_01))

        val lvContactos = findViewById<ListView>(R.id.lvLista)
        val adaptador = AdaptadorCustom(this, contactos!!)
        lvContactos?.adapter = adaptador

        lvContactos.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, Detalle::class.java)
            intent.putExtra("ID", position)
            startActivity(intent)
        }

    }
}
