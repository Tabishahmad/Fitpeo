package com.example.fitpeo.presentation.list

import android.content.Context
import android.view.View
import android.widget.ImageButton
import com.example.fitpeo.R
import com.example.fitpeo.domain.model.Album
import com.example.fitpeo.domain.model.NetworkResult
import com.example.fitpeo.domain.usecase.UseCase
import com.example.fitpeo.presentation.core.ViewState
import com.example.fitpeo.presentation.core.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@HiltViewModel
class AlbumListViewModel @Inject constructor(private val useCase: UseCase, private val context: Context) :
    BaseViewModel() {

    private val uiStateFlow = MutableStateFlow<ViewState<List<Album>>>(ViewState.Loading(true))
    fun getviewStateFlow(): StateFlow<ViewState<List<Album>>> = uiStateFlow


    fun fetchList() {
        performCoroutineTask{
            useCase.getListUseCase().collect { result ->
                uiStateFlow.emit(when (result) {
                    is NetworkResult.Success -> ViewState.Success(result.data)
                    is NetworkResult.Failure -> ViewState.Failure(context.getString(R.string.faild_to_retrive))
                })
            }
        }
    }



    fun handleFavoriteAlbum(view: View, album: Album) {
        performCoroutineTask {
            val button: ImageButton = view as ImageButton
            val isCurrentlyFav = album.isFav
            album.isFav = !isCurrentlyFav
            if (isCurrentlyFav) {
                useCase.manageAlbumFavoriteUseCase.removeAlbumFromFavorites(album)
                button.setImageResource(R.drawable.ic_favorite_border)
            } else {
                useCase.manageAlbumFavoriteUseCase.setAlbumFavorite(album)
                button.setImageResource(R.drawable.ic_favorite)
            }
        }
    }

    fun getAllFavouriteAlbums(): Flow<List<Album>> {
        return flow {
            emit(useCase.manageAlbumFavoriteUseCase.getAlbumsList())
        }
    }

    fun isFavoriteAlbum(album: Album, callback: (Boolean) -> Unit) {
        performCoroutineTask {
            var result = useCase.manageAlbumFavoriteUseCase.isFavoriteAlbum(album)
            callback(result)
        }
    }
}