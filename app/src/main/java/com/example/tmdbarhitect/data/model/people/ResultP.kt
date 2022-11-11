package com.example.tmdbarhitect.data.model.people


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "popular_people")
data class ResultP(
    @PrimaryKey
    @SerializedName("id")
    val id: Int,
    val knownForDepartment: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("profile_path")
    val profilePath: String
)