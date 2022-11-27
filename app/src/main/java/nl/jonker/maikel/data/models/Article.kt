package nl.jonker.maikel.data.models

import java.sql.Timestamp

data class Article(
    val id: Long,
    val feed: Int,
    val title: String,
    val publishDate: Timestamp,
    val image: String,
    val url: String,
    val related: List<String> = emptyList(),
    val categories: List<Category> = emptyList(),
    val isLiked: Boolean
)
