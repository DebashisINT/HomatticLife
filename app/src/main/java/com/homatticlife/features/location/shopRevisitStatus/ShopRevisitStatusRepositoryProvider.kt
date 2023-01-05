package com.homatticlife.features.location.shopRevisitStatus

import com.homatticlife.features.location.shopdurationapi.ShopDurationApi
import com.homatticlife.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}