package com.homatticlife.features.viewAllOrder.model

import com.homatticlife.app.domain.NewOrderColorEntity
import com.homatticlife.app.domain.NewOrderGenderEntity
import com.homatticlife.app.domain.NewOrderProductEntity
import com.homatticlife.app.domain.NewOrderSizeEntity
import com.homatticlife.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

