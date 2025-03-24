package com.plcoding.cryptotracker.crypto.data.networking.dto

import com.plcoding.cryptotracker.crypto.domain.Coin
import kotlinx.serialization.Serializable

@Serializable
data class CoinsResponseDto(
    val data: List<CoinDto>
)
