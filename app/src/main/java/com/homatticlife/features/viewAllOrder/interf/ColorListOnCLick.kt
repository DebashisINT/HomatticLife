package com.homatticlife.features.viewAllOrder.interf

import com.homatticlife.app.domain.NewOrderGenderEntity
import com.homatticlife.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}