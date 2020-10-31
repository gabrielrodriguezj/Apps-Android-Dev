package com.example.contactos

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AdaptadorCustom (var context:Context, items:ArrayList<Contacto>): BaseAdapter()
{
    //Almacena los elementos que se mostrarán en el listview
    var items:ArrayList<Contacto>? = null
    init {
        this.items = items
    }

    override fun getCount(): Int {
        return this.items?.count()!!
    }

    override fun getItem(position: Int): Any {
        return this.items?.get(position)!!
    }

    override fun getItemId(position: Int): Long {
        //El objeto contacto no tiene un elemento id
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var viewHolder:ViewHolder? = null
        var vista:View? = convertView

        if(vista == null){
            vista = LayoutInflater.from(context).inflate(R.layout.template_contacto,null)
            viewHolder = ViewHolder(vista)
            vista.tag = viewHolder
        }
        else{
            viewHolder = vista.tag as? ViewHolder
        }

        val item = getItem(position) as Contacto

        //Asignación de valoresa elementos gráficos
        viewHolder?.nombre?.text = item.nombre
        viewHolder?.empresa?.text = item.empresa
        viewHolder?.foto?.setImageResource(item.foto)

        return vista!!
    }

    private class ViewHolder(vista:View){
        var nombre:TextView? = null
        var foto:ImageView? = null
        var empresa:TextView? = null

        init{
            nombre = vista.findViewById(R.id.tvNombre)
            foto = vista.findViewById(R.id.ivFoto)
            empresa = vista.findViewById(R.id.tvEmpresa)
        }
    }
}