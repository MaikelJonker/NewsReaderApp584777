package nl.jonker.maikel.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import nl.jonker.maikel.data.models.Article
import nl.jonker.maikel.data.repos.ArticleRepo
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private var articleRepository: ArticleRepo
): ViewModel(){

    private val _state = MutableStateFlow(emptyList<Article>())
    val state:StateFlow<List<Article>>
        get() = _state


    init{
        viewModelScope.launch {
            println(articleRepository.getAllArticles())
            _state.value = articleRepository.getAllArticles()
        }
    }
}