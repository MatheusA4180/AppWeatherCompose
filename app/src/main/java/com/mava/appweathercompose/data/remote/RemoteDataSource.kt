package com.mava.appweathercompose.data.remote

import com.mava.appweathercompose.data.remote.response.WeatherDataResponse

interface RemoteDataSource {

    suspend fun getWeatherDataResponse(lat: Double, lng: Double): WeatherDataResponse

}