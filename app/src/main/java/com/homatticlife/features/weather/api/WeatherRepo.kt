package com.homatticlife.features.weather.api

import com.homatticlife.base.BaseResponse
import com.homatticlife.features.task.api.TaskApi
import com.homatticlife.features.task.model.AddTaskInputModel
import com.homatticlife.features.weather.model.ForeCastAPIResponse
import com.homatticlife.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}