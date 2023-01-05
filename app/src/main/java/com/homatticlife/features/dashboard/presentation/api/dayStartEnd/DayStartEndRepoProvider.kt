package com.homatticlife.features.dashboard.presentation.api.dayStartEnd

import com.homatticlife.features.stockCompetetorStock.api.AddCompStockApi
import com.homatticlife.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}