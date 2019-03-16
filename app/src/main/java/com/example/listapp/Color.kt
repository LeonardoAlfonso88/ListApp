package com.example.listapp

class Color {

    var id: Int? = null
    var color: String? = null
    var opacity: Double? = null

    constructor(id: Int, color: String, opacity: Double) {
        this.id = id
        this.color = color
        this.opacity = opacity
    }
}