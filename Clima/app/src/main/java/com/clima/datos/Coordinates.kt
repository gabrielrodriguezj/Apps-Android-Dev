package com.example.clima.response

class Coordinates (lon:Float, lat: Float){
    var lon:Float = 0f
    var lat:Float = 0f

    constructor(): this(0f, 0f)

    init {
        this.lon = lon
        this.lat = lat
    }
}