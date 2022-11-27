package nl.jonker.maikel.data.entities

import nl.jonker.maikel.data.models.Category
import java.sql.Timestamp

data class ArticleEntity(
    val Id: Long?,
    val Feed: Int?,
    val Title: String?,
    val PublishDate: Timestamp?,
    val Image: String?,
    val Url: String?,
    val Related: List<String>?,
    val Categories: List<Category>?,
    val IsLiked: Boolean?
)
