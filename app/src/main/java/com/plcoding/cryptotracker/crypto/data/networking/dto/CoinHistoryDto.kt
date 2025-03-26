package com.plcoding.cryptotracker.crypto.data.networking.dto

import kotlinx.serialization.Serializable

/**
 * Data transfer object representing historical price data for a cryptocurrency.
 * Used to deserialize API responses containing a time series of price points.
 *
 * @property data A list of [CoinPriceDto] objects, each containing a price (USD) and timestamp pair.
 */
@Serializable
data class CoinHistoryDto(
    val data: List<CoinPriceDto>
)
