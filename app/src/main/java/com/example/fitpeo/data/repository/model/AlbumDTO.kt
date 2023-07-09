package com.example.fitpeo.data.repository.model

import com.example.fitpeo.domain.model.Album

data class AlbumDTO(
    val albumId: Int,
    val id : Int,
    val title: String?,
    val url: String?,
    val thumbnailUrl: String?){

//    fun List<AlbumDTO>?.toAlbumList(): List<Album> {
//        return this?.map { dto ->
//            Album(dto.albumId, dto.id, dto.title, dto.url, dto.thumbnailUrl)
//        } ?: emptyList()
//    }
}
