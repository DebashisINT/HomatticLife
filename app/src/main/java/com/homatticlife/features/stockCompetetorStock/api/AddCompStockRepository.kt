package com.homatticlife.features.stockCompetetorStock.api

import com.homatticlife.base.BaseResponse
import com.homatticlife.features.orderList.model.NewOrderListResponseModel
import com.homatticlife.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.homatticlife.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}