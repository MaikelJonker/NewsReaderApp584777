package nl.jonker.maikel.data.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Article(
    @Json(name = "Categories")
    val categories: List<Category>,
    @Json(name = "Feed")
    val feed: Int,
    @Json(name = "Id")
    val id: Int,
    @Json(name = "Image")
    val image: String,
    @Json(name = "IsLiked")
    val isLiked: Boolean,
    @Json(name = "PublishDate")
    val publishDate: String,
    @Json(name = "Related")
    val related: List<String>,
    @Json(name = "Summary")
    val summary: String,
    @Json(name = "Title")
    val title: String,
    @Json(name = "Url")
    val url: String
)