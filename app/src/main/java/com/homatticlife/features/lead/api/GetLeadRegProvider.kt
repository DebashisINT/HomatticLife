package com.homatticlife.features.lead.api

import com.homatticlife.features.NewQuotation.api.GetQuotListRegRepository
import com.homatticlife.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}