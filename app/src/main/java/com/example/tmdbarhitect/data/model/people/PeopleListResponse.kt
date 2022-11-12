package com.example.tmdbarhitect.data.model.people


import com.google.gson.annotations.SerializedName

data class PeopleListResponse(
   @SerializedName("results")
    val results: List<ResultP>

)