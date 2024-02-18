package com.mava.appweathercompose.data.repository

import com.mava.appweathercompose.model.WeatherInfo

interface WeatherRepository {

    suspend fun getWeatherData(lat: Double, lng: Double): WeatherInfo

}