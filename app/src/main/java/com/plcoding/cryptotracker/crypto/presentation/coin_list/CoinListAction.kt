package com.plcoding.cryptotracker.crypto.presentation.coin_list

import com.plcoding.cryptotracker.crypto.presentation.models.CoinUi

sealed interface CoinListAction {

    /**
     * Action triggered when a user clicks on a specific coin in the list.
     * Used to display detailed information about the selected coin in a details screen.
     *
     * @property coinUi The coin that was clicked
     */
    data class OnCoinClick(val coinUi: CoinUi): CoinListAction
}