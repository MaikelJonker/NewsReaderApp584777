package nl.jonker.maikel.data.api

import nl.jonker.maikel.data.models.Article
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path


interface Api {

    @GET("/Articles")
    suspend fun getArticles(
        @Path("amount") amount: Int
    ): Response<List<Article>>
}