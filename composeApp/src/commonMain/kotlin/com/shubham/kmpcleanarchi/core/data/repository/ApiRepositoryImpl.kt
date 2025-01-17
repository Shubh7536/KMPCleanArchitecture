package com.shubham.kmpcleanarchi.core.data.repository

import com.shubham.kmpcleanarchi.core.data.utils.DataResult
import com.shubham.kmpcleanarchi.core.data.utils.dataResultSafeApiCall
import com.shubham.kmpcleanarchi.core.domain.models.User
import com.shubham.kmpcleanarchi.core.domain.repository.ApiRepository
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.http.ContentType
import io.ktor.http.contentType

class ApiRepositoryImpl(private val httpClient: HttpClient/*,
                        private val sessionHandler: DefaultSessionHandler*/) : ApiRepository {
    override suspend fun getUser(email: String): DataResult<ArrayList<User>> {
        return dataResultSafeApiCall {
            val response = httpClient.get("https://potterapi-fedeperin.vercel.app/es/characters") {
                contentType(ContentType.Application.Json)
            }
            val user = response.body<ArrayList<User>>()
            //sessionHandler.saveUser(user)
            user
        }
    }

}