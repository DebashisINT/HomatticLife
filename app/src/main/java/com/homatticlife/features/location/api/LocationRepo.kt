package com.homatticlife.features.location.api

import com.homatticlife.app.Pref
import com.homatticlife.base.BaseResponse
import com.homatticlife.features.location.model.AppInfoInputModel
import com.homatticlife.features.location.model.AppInfoResponseModel
import com.homatticlife.features.location.model.GpsNetInputModel
import com.homatticlife.features.location.model.ShopDurationRequest
import com.homatticlife.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable

/**
 * Created by Saikat on 17-Aug-20.
 */
class LocationRepo(val apiService: LocationApi) {
    fun appInfo(appInfo: AppInfoInputModel?): Observable<BaseResponse> {
        return apiService.submitAppInfo(appInfo)
    }

    fun getAppInfo(): Observable<AppInfoResponseModel> {
        return apiService.getAppInfo(Pref.session_token!!, Pref.user_id!!)
    }

    fun gpsNetInfo(appInfo: GpsNetInputModel?): Observable<BaseResponse> {
        return apiService.submitGpsNetInfo(appInfo)
    }
}