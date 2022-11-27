package nl.jonker.maikel.data.mappers

import nl.jonker.maikel.data.entities.ArticleEntity
import nl.jonker.maikel.data.models.Article

class ArticleMapper {
    fun map(entity: ArticleEntity): Result<Article> = runCatching {
        with(entity) {
            Article(
                id = Id !!,
                feed = Feed !!,
                title = Title !!,
                publishDate = PublishDate !!,
                image = Image !!,
                url = Url !!,
                related = Related !!,
                categories = Categories !!,
                isLiked = IsLiked!!
            )
        }
    }
}