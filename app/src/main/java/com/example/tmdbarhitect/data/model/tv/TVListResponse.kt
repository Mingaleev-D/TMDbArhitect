package com.example.tmdbarhitect.data.model.tv


import com.google.gson.annotations.SerializedName

data class TVListResponse(
   @SerializedName("page")
    val page: Int,
   @SerializedName("results")
    val results: List<ResultTV>,
   @SerializedName("total_pages")
    val totalPages: Int,
   @SerializedName("total_results")
    val totalResults: Int
)