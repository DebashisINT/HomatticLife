package com.homatticlife.features.stockAddCurrentStock.api

import com.homatticlife.base.BaseResponse
import com.homatticlife.features.location.model.ShopRevisitStatusRequest
import com.homatticlife.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.homatticlife.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.homatticlife.features.stockAddCurrentStock.model.CurrentStockGetData
import com.homatticlife.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}