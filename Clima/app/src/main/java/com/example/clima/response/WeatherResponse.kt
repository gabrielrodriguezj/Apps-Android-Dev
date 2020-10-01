package com.example.clima.response

import java.util.*
import kotlin.collections.ArrayList

class WeatherResponse(coord: Coordinates, weather: ArrayList<Weather>, base:String, main:Main, wind: Wind, cloud: Cloud,
                        dt:Int, sys: System, timeZone: Int, id:Int, name: String, cod: Int){

    var coord = Coordinates()
    var weather = ArrayList<Weather>()
    var base = ""
    var main = Main()
    var wind = Wind()
    var cloud = Cloud()
    var dt = 0
    var sys = System()
    var timeZone = 0
    var id = 0
    var name = ""
    var cod = 0

    init {
        this.coord = coord
        this.weather = weather
        this.base = base
        this.main = main
        this.wind = wind
        this.cloud = cloud
        this.dt = dt
        this.sys = sys
        this.timeZone = timeZone
        this.id = id
        this.name = name
        this.cod = cod
    }
}
