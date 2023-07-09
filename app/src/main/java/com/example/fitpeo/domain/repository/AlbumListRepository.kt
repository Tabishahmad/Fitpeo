package com.example.fitpeo.domain.repository


import com.example.fitpeo.domain.model.Album
import com.example.fitpeo.domain.model.NetworkResult

fun interface AlbumListRepository {
    suspend fun getAlbumList(): NetworkResult<Album>
}