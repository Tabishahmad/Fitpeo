package com.example.fitpeo.domain.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.fitpeo.common.DATABASE_TABLE_NAME
import kotlinx.parcelize.Parcelize

@Entity(tableName = DATABASE_TABLE_NAME)
@Parcelize
data class Album(val albumId: Int,@PrimaryKey
                 val id : Int,
                 val title: String?,
                 val url: String?,
                 val thumbnailUrl: String?,
                 var isFav:Boolean = false): Parcelable