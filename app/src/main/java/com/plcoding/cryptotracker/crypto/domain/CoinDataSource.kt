package com.plcoding.cryptotracker.crypto.domain

import com.plcoding.cryptotracker.core.domain.util.NetworkError
import com.plcoding.cryptotracker.core.domain.util.Result

interface CoinDataSource {

    /**
     * Retrieves a list of all available cryptocurrencies
     * @return Result containing either a List of Coins or a NetworkError if the operation fails
     */
    suspend fun getCoins(): Result<List<Coin>, NetworkError>

    suspend fun getCoinById(coinId: String): Result<Coin, NetworkError>
}