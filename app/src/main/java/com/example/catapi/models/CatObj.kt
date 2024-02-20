package com.example.catapi.models
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class CatObj(
    val image: Pixels,
    val status_code: Int,
    val title: String,
    val url: String
):Parcelable