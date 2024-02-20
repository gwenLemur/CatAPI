package com.example.catapi.models
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
@Parcelize
data class Pixels (
    val avif: String,
    val jpg:String,
    val jxl: String,
    val webp: String

): Parcelable