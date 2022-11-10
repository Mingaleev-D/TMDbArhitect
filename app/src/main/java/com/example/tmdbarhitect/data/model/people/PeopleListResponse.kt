package com.example.tmdbarhitect.data.model.people


import com.google.gson.annotations.SerializedName

data class PeopleListResponse(
   @SerializedName("page")
    val page: Int,
   @SerializedName("results")
    val results: List<ResultP>,
   @SerializedName("total_pages")
    val totalPages: Int,
   @SerializedName("total_results")
    val totalResults: Int
)