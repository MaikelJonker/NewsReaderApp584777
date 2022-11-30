package nl.jonker.maikel.data.models.mappers

import nl.jonker.maikel.data.models.Article
import nl.jonker.maikel.data.models.Category
import nl.jonker.maikel.data.models.responsebodies.GetArticlesResponse
import javax.inject.Inject

class ArticleMapper @Inject constructor(){
    fun map(entity: GetArticlesResponse.Result): Result<Article> = runCatching {
        with(entity) {
            Article(
                id = id,
                feed = feed,
                title = title,
                summary = summary,
                publishDate = publishDate,
                image = image,
                url = url,
                related = related,
                categories = categories.map{ Category( it.id, it.name) },
                isLiked = isLiked
            )
        }
    }
}

