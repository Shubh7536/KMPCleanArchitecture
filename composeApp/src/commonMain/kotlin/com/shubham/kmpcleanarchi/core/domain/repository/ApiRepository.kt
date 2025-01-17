package com.shubham.kmpcleanarchi.core.domain.repository

import com.shubham.kmpcleanarchi.core.data.utils.DataResult
import com.shubham.kmpcleanarchi.core.domain.models.User

interface ApiRepository {
    suspend fun getUser(email: String): DataResult<ArrayList<User>>
}