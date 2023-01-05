package com.homatticlife.features.newcollectionreport

import com.homatticlife.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}