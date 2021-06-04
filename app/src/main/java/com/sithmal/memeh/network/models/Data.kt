package com.sithmal.memeh.network.models


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("bottomText")
    val bottomText: String?,
    @SerializedName("ID")
    val iD: Int?,
    @SerializedName("image")
    val image: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("rank")
    val rank: Int?,
    @SerializedName("tags")
    val tags: String?,
    @SerializedName("topText")
    val topText: String?
)