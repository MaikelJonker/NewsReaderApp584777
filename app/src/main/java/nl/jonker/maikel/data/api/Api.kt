package nl.jonker.maikel.data.api

import nl.jonker.maikel.data.models.responsebodies.GetArticlesResponse
import retrofit2.Response
import retrofit2.http.GET

interface Api {

    @GET("Articles")
    suspend fun getAllArticles(): Response<GetArticlesResponse>
}