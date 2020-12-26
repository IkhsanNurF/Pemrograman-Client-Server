package com.appsanur.app.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class News (
    val poster: String = "",
    val judul: String = "",
    val link: String = "",
    val tipe: String = "",
    val waktu: String = ""
) : Parcelable