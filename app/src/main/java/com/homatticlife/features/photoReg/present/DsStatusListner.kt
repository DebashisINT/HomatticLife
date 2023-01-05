package com.homatticlife.features.photoReg.present

import com.homatticlife.app.domain.ProspectEntity
import com.homatticlife.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}