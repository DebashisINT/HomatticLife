package com.homatticlife.features.quotation.api

import com.homatticlife.app.Pref
import com.homatticlife.base.BaseResponse
import com.homatticlife.features.quotation.model.AddQuotInputModel
import com.homatticlife.features.quotation.model.BSListResponseModel
import com.homatticlife.features.quotation.model.QuotationListResponseModel
import io.reactivex.Observable

/**
 * Created by Saikat on 12-Jun-20.
 */
class QuotationRepo(val apiService: QuotationApi) {
    fun getBSList(): Observable<BSListResponseModel> {
        return apiService.getBSList(Pref.session_token!!, Pref.user_id!!)
    }

    fun addQuot(addQuot: AddQuotInputModel): Observable<BaseResponse> {
        return apiService.AddQuotation(addQuot)
    }

    fun getQuotList(): Observable<QuotationListResponseModel> {
        return apiService.getQuotationList(Pref.session_token!!, Pref.user_id!!)
    }

    fun sendQuoSmsMail(quo_id: String, shop_id: String, isSms: Boolean): Observable<BaseResponse> {
        return apiService.sendQuotationMailSms(Pref.session_token!!, Pref.user_id!!, quo_id, shop_id, isSms)
    }
}