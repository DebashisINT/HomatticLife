package com.homatticlife.features.weather.api

import com.homatticlife.features.task.api.TaskApi
import com.homatticlife.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}