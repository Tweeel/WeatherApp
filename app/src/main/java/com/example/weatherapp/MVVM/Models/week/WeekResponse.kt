package com.example.weatherapp.MVVM.Models.week

data class WeekResponse(
    val current: Current,
    val forecast: Forecast,
    val location: Location
)