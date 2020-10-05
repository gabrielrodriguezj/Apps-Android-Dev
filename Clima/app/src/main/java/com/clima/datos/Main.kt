package com.example.clima.response

class Main(temp: Float, feels_like: Float, temp_min:Float, temp_max:Float, pressure:Int, humidity:Int, visibility:Int) {
    var temp: Float = 0f
    var feels_like: Float = 0f
    var temp_min: Float = 0f
    var temp_max: Float = 0f
    var pressure:Int = 0
    var humidity:Int = 0
    var visibility:Int = 0

    constructor(): this(0f, 0f, 0f, 0f, 0,0,0)

    init {
        this.temp = temp
        this.feels_like = feels_like
        this.temp_min = temp_min
        this.temp_max = temp_max
        this.pressure = pressure
        this.humidity = humidity
        this.visibility = visibility
    }
}


