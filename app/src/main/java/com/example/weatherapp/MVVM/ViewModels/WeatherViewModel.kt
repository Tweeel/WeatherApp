package com.example.weatherapp.MVVM.ViewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class WeatherViewModel(
    app: Application,
    private val newsRepository: WeatherViewModel
    ) : AndroidViewModel(app) {
}