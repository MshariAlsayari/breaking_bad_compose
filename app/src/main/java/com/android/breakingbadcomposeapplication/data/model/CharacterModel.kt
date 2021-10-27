package com.android.breakingbadcomposeapplication.data.model

import com.google.gson.annotations.SerializedName

data class CharacterModel(@SerializedName(  "char_id")
                     var id: Int = 0,
                     @SerializedName(  "name")
                     var name: String? = "",
                     @SerializedName( "birthday")
                     var birthday: String? = "",
                     @SerializedName(  "occupation")
                     var occupation: List<String>? = listOf(),
                     @SerializedName(  "img")
                     var img: String? = "",
                     @SerializedName( "status")
                     var status: String? = "",
                     @SerializedName( "nickname")
                     var nickname: String? = "",
                     @SerializedName( "appearance")
                     var appearance: List<Int>? = listOf(),
                     @SerializedName( "portrayed")
                     var portrayed: String? = "",
                     @SerializedName( "category")
                     var category: String? = "")