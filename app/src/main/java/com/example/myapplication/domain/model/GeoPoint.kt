package com.example.myapplication.domain.model

data class GeoPoint(
    val latitude: Double,
    val longitude: Double
)

data class City(
    val name: String,
    val region: String,
    val point: GeoPoint
)