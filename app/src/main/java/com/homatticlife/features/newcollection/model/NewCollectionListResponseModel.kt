package com.homatticlife.features.newcollection.model

import com.homatticlife.app.domain.CollectionDetailsEntity
import com.homatticlife.base.BaseResponse
import com.homatticlife.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}