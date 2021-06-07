package com.dicoding.filmku.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Movie (
    var img : String? = "",
    var title: String? = "",
    var description: String? = "",
    var release: String? = ""
) : Parcelable