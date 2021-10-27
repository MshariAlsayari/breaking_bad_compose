package com.android.breakingbadcomposeapplication.data.model

import com.google.gson.annotations.SerializedName

data class EpisodeModel(@SerializedName("episode_id")
                        var id: Int = 0,
                        @SerializedName("title")
                        var title: String? = "",
                        @SerializedName("season")
                        var season: String? = "",
                        @SerializedName("episode")
                        var episode: String? = "",
                        @SerializedName("air_date")
                        var air_date: String? = "",
                        @SerializedName("characters")
                        var characters: List<String>? = listOf(),
                        @SerializedName("series")
                        var series: String? = "")