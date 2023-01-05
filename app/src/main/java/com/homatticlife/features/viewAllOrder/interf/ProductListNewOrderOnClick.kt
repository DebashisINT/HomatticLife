package com.homatticlife.features.viewAllOrder.interf

import com.homatticlife.app.domain.NewOrderGenderEntity
import com.homatticlife.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}