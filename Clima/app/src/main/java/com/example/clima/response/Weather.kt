package com.example.clima.response

class Weather (id:Long, main:String, description:String, icon:String){
    var id:Long = 0
    var main:String = ""
    var description:String = ""
    var icon:String = ""

    constructor(): this(0,"","","")

    init {
        this.id = id
        this.main = main
        this.description = description
        this.icon = icon
    }

}