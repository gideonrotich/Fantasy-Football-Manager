package com.swayy.core_network.model.collection_details

data class Data(
    val collection: String,
    val description: String,
    val discord: String,
    val items: List<Item>,
    val logo: String,
    val official_rarity: Int,
    val ranking_url: String,
    val twitter: String,
    val website: String
)