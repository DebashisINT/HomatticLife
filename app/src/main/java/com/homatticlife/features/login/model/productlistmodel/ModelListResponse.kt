package com.homatticlife.features.login.model.productlistmodel

import com.homatticlife.app.domain.ModelEntity
import com.homatticlife.app.domain.ProductListEntity
import com.homatticlife.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}