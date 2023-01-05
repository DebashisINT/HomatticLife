package com.homatticlife.features.viewAllOrder.interf

import com.homatticlife.app.domain.NewOrderColorEntity
import com.homatticlife.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}