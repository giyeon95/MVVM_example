package com.kolon.mvvm_example.data.remote.api

import com.kolon.mvvm_example.data.remote.response.RepositoriesResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface SearchAPI {

    @GET("/search/repositories")
    fun search(@QueryMap params: MutableMap<String, String>): Single<RepositoriesResponse>
}