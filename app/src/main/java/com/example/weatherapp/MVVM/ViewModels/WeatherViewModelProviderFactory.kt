package com.example.weatherapp.MVVM.ViewModels

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class WeatherViewModelProviderFactory(
val app: Application,
val watherRepository: WeatherViewModel
): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return WeatherViewModel(app,watherRepository) as T
    }

}