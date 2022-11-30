package nl.jonker.maikel.data.repos

import nl.jonker.maikel.data.api.Api
import nl.jonker.maikel.data.models.Article
import nl.jonker.maikel.data.models.mappers.ArticleMapper
import nl.jonker.maikel.data.models.responsebodies.GetArticlesResponse
import retrofit2.Response
import javax.inject.Inject
import kotlin.math.E

class ArticleRepo @Inject constructor(
    private val api: Api,
    private val articleMapper: ArticleMapper
    ){

    suspend fun getAllArticles(): List<Article> {
        val response = api.getAllArticles()
        val articles = mutableListOf<Article>()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null) {
                for(article in body.results) {
                    articles.add(articleMapper.map(article).getOrThrow())
                }
            }
            else{
                throw Exception("body is null")
            }
        }
        else{
            throw Exception("Something went wrong: Code ${response.code()}")
        }
        return articles
    }
}

