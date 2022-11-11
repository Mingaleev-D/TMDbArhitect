package com.example.tmdbarhitect.data.model.tv


import com.google.gson.annotations.SerializedName

data class TVListResponse(
   @SerializedName("results")
    val results: List<ResultTV>

)