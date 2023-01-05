package com.homatticlife.features.viewAllOrder.interf

import com.homatticlife.app.domain.NewOrderGenderEntity
import com.homatticlife.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}