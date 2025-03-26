package com.plcoding.cryptotracker.crypto.domain

import java.time.ZonedDateTime

/**
 * Represents the price of a cryptocurrency in USD at a specific point in time.
 *
 * @property priceUsd Cryptocurrency price in USD
 * @property date The date and time the price was recorded
 */
data class CoinPrice(
    val priceUsd: Double,
    val date: ZonedDateTime
)



