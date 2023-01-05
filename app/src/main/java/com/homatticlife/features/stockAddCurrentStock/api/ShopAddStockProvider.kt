package com.homatticlife.features.stockAddCurrentStock.api

import com.homatticlife.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.homatticlife.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}