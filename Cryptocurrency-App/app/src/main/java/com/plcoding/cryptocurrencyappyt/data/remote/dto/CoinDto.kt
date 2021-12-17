package com.plcoding.cryptocurrencyappyt.data.remote.dto

data class CoinDto(
    val id: String,
    val isActive: Boolean,
    val is_new: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)