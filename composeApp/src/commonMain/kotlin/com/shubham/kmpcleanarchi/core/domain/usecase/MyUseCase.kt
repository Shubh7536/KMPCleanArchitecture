package com.shubham.kmpcleanarchi.core.domain.usecase

import com.shubham.kmpcleanarchi.core.data.utils.DataResult
import com.shubham.kmpcleanarchi.core.domain.models.User
import com.shubham.kmpcleanarchi.core.domain.repository.ApiRepository

class MyUseCase (private val apiRepository: ApiRepository) {
    suspend fun getUser(): DataResult<ArrayList<User>>{
        return apiRepository.getUser("")
    }
}