package com.sithmal.memeh.network.models


import com.google.gson.annotations.SerializedName

data class MemePageResponse(
    @SerializedName("code")
    val code: Int?,
    @SerializedName("data")
    val `data`: List<Data>?,
    @SerializedName("message")
    val message: String?,
    @SerializedName("next")
    val next: String?
)