package nl.jonker.maikel.ui.detail

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import nl.jonker.maikel.data.models.Article

@Composable
fun Detail(article: Article){
    Text(article.summary)
}