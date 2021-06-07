package com.dicoding.filmku.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class TvShow (
    var img : String? = "",
    var title: String? = "",
    var description: String? = "",
    var release: String? = ""
) : Parcelable