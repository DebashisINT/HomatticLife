package com.homatticlife.features.nearbyuserlist.api

import com.homatticlife.app.Pref
import com.homatticlife.features.nearbyuserlist.model.NearbyUserResponseModel
import com.homatticlife.features.newcollection.model.NewCollectionListResponseModel
import com.homatticlife.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}