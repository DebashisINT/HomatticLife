package com.homatticlife.features.viewAllOrder.interf

import com.homatticlife.app.domain.NewOrderProductEntity
import com.homatticlife.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}