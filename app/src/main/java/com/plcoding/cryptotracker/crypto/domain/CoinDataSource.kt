package com.plcoding.cryptotracker.crypto.domain

import com.plcoding.cryptotracker.core.domain.util.NetworkError
import com.plcoding.cryptotracker.core.domain.util.Result
import java.time.ZonedDateTime

interface CoinDataSource {

    /**
     * Retrieves a list of all available cryptocurrencies
     * @return Result containing either a List of Coins or a NetworkError if the operation fails
     */
    suspend fun getCoins(): Result<List<Coin>, NetworkError>

    /**
     * Retrieves a list of historical prices for a specific cryptocurrency
     * The response object contains prices and the respective timestamps
     *
     * @param coinId the ID of the cryptocurrency to retrieve historical prices for
     * @param start the start date and time for the historical price range
     * @param end the end date and time for the historical price range
     * @return Result containing either a List of CoinPrice objects or a NetworkError if the operation fails
     */
    suspend fun getCoinHistory(
        coinId: String,
        start: ZonedDateTime,
        end: ZonedDateTime
    ): Result<List<CoinPrice>, NetworkError>
}