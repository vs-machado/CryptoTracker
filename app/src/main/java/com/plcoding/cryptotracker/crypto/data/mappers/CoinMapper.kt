package com.plcoding.cryptotracker.crypto.data.mappers

import com.plcoding.cryptotracker.crypto.data.networking.dto.CoinDto
import com.plcoding.cryptotracker.crypto.data.networking.dto.CoinPriceDto
import com.plcoding.cryptotracker.crypto.domain.Coin
import com.plcoding.cryptotracker.crypto.domain.CoinPrice
import java.time.Instant
import java.time.ZoneId

/**
 * Extension function to convert a CoinDto (Data Transfer Object) to a domain Coin model.
 * This mapping function helps separate the data layer (DTO) from the domain layer (Coin).
 *
 * @return [Coin] - Domain model with essential cryptocurrency information
 */
fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        rank = rank,
        name = name,
        symbol = symbol,
        marketCapUsd = marketCapUsd,
        priceUsd = priceUsd,
        changePercent24Hr = changePercent24Hr
    )
}

fun CoinPriceDto.toCoinPrice(): CoinPrice {
    return CoinPrice(
        priceUsd = this.priceUsd,
        date = Instant
            .ofEpochMilli(this.time)
            .atZone(ZoneId.of("UTC"))
    )
}