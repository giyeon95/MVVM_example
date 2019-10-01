package com.kolon.mvvm_example.data.remote.response

import com.google.gson.annotations.SerializedName
import com.kolon.mvvm_example.data.remote.domain.Repository

data class RepositoriesResponse(
    @SerializedName("total_count") val totalCount: Int,
    @SerializedName("incomplete_results") val incompleteResults: Boolean,
    @SerializedName("items") val repositories: ArrayList<Repository>
)