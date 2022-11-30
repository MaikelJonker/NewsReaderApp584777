package nl.jonker.maikel.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import nl.jonker.maikel.data.models.Article
import nl.jonker.maikel.ui.detail.Detail

@Composable
fun ArticleRow(article: Article){

    Row(Modifier.clickable {  }){
        AsyncImage(
            modifier = Modifier
                    .size(80.dp),
            model = article.image,
            contentDescription = "Image of ${article.title}",
            contentScale = ContentScale.Fit
        )
        Text(text = article.title)
    }
}

private fun onClick(article: Article){

}