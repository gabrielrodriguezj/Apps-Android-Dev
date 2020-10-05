package com.example.clima.response

class Wind (speed: Float, deg: Int) {
    var speed:Float = 0f
    var deg:Int	= 0

    constructor(): this(0f, 0)

    init {
        this.speed = speed
        this.deg = deg
    }
}