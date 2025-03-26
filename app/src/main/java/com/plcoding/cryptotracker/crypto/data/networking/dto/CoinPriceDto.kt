package com.plcoding.cryptotracker.crypto.data.networking.dto

import kotlinx.serialization.Serializable

/**
 * Data transfer object representing a single price point for a cryptocurrency.
 *
 * @property priceUsd The price of the cryptocurrency in US dollars at the given timestamp.
 *                    Represented as a [Double] to maintain decimal precision.
 * @property time The Unix timestamp (in milliseconds) when this price was recorded.
 *               Can be converted to a readable date using [java.time.Instant].
 */
@Serializable
data class CoinPriceDto(
    val priceUsd: Double,
    val time: Long
)