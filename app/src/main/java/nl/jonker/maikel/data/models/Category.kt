package nl.jonker.maikel.data.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Category(
    @Json(name = "Id")
    val id: Int,
    @Json(name = "Name")
    val name: String
)