package com.plcoding.cryptotracker.crypto.presentation.models

import android.icu.text.NumberFormat
import androidx.annotation.DrawableRes
import com.plcoding.cryptotracker.crypto.domain.Coin
import com.plcoding.cryptotracker.core.presentation.util.getDrawableIdForCoin
import com.plcoding.cryptotracker.crypto.presentation.coin_detail.DataPoint
import java.util.Locale

/**
 * Represents a Coin in the UI layer.
 * [marketCapUsd], [priceUsd] and [changePercent24Hr] are converted to a human-readable format
 * using the [DisplayableNumber] data class, which provides both the raw [DisplayableNumber.value] and a [DisplayableNumber.formatted] string representation.
 */
data class CoinUi(
    val id: String,
    val name: String,
    val symbol: String,
    val rank: Int,
    val marketCapUsd: DisplayableNumber,
    val priceUsd: DisplayableNumber,
    val changePercent24Hr: DisplayableNumber,
    val coinPriceHistory: List<DataPoint> = emptyList(),
    @DrawableRes val iconRes: Int
)

data class DisplayableNumber(
    val value: Double,
    val formatted: String
)

fun Coin.toCoinUi(): CoinUi {
    return CoinUi(
        id = this.id,
        name = this.name,
        symbol = this.symbol,
        rank = this.rank,
        marketCapUsd = this.marketCapUsd.toDisplayableNumber(),
        priceUsd = this.priceUsd.toDisplayableNumber(),
        changePercent24Hr = this.changePercent24Hr.toDisplayableNumber(),
        iconRes = getDrawableIdForCoin(this.symbol)
    )
}

fun Double?.toDisplayableNumber(): DisplayableNumber {
    return if (this != null) {
        val formatter = NumberFormat.getNumberInstance(Locale.getDefault()).apply {
            minimumFractionDigits = 2
            maximumFractionDigits = 2
        }
        DisplayableNumber(
            value = this,
            formatted = formatter.format(this)
        )
    } else {
        DisplayableNumber(value = 0.0, formatted = "ERROR")
    }
}