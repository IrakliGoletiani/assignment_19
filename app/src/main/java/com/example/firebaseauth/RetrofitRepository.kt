package com.example.firebaseauth


import retrofit2.Response
import retrofit2.http.GET

interface RetrofitRepository {

    @GET("/v1/token?key=[API_KEY]")
    suspend fun signIn(): Response<User>
}