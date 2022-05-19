package dev.miran.remote.api

import dev.miran.remote.api.response.GetNameResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NameApi {
    @GET("/")
    suspend fun loadNameList(@Query("limit") limit: Int = 10, @Query("offset") offset: Int = 0) :Response<GetNameResponse>
}