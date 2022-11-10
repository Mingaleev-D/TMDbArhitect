package com.example.tmdbarhitect.data.model.people


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "popular_people")
data class ResultP(
    @SerializedName("adult")
    val adult: Boolean,
    @SerializedName("gender")
    val gender: Int,
    @PrimaryKey
    @SerializedName("id")
    val id: Int,
    val knownForDepartment: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("popularity")
    val popularity: Double,
    @SerializedName("profile_path")
    val profilePath: String
)