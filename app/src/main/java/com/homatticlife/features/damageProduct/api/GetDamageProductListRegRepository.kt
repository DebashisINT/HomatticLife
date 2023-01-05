package com.homatticlife.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.homatticlife.app.FileUtils
import com.homatticlife.base.BaseResponse
import com.homatticlife.features.NewQuotation.model.*
import com.homatticlife.features.addshop.model.AddShopRequestData
import com.homatticlife.features.addshop.model.AddShopResponse
import com.homatticlife.features.damageProduct.model.DamageProductResponseModel
import com.homatticlife.features.damageProduct.model.delBreakageReq
import com.homatticlife.features.damageProduct.model.viewAllBreakageReq
import com.homatticlife.features.login.model.userconfig.UserConfigResponseModel
import com.homatticlife.features.myjobs.model.WIPImageSubmit
import com.homatticlife.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}