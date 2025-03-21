package com.plcoding.cryptotracker.crypto.presentation.coin_list

import androidx.compose.runtime.Immutable
import com.plcoding.cryptotracker.crypto.presentation.models.CoinUi

/**
 * Represents the UI state for the coin list screen.
 *
 * @property isLoading Indicates whether data is currently being fetched.
 *                    When true, displays a loading indicator.
 * @property coins List of cryptocurrencies to display.
 *                 Empty when no data is available.
 * @property selectedCoin Currently selected coin for detailed view.
 *                       Null when no coin is selected.
 */
@Immutable
data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<CoinUi> = emptyList(),
    val selectedCoin: CoinUi? = null
)