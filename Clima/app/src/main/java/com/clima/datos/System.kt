package com.example.clima.response

class System (type:Int, id:Int, country: String, sunrise:Int, sunset:Int) {
    var type:Int = 0
    var id:Int = 0
    var country: String = ""
    var sunrise:Int = 0
    var sunset:Int = 0

    constructor(): this(0, 0, "", 0, 0)

    init {
        this.type = type
        this.id = id
        this.country = country
        this.sunrise = sunrise
        this.sunset = sunset
    }
}