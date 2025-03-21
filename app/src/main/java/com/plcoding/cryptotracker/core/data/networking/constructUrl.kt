package com.plcoding.cryptotracker.core.data.networking

import com.plcoding.cryptotracker.BuildConfig

/**
 * Constructs an URL by appending the provided endpoint to the base URL.
 * @param url the API url or endpoint to be appended.
 * @return the API url with appended endpoint
 */
fun constructUrl(url: String): String {
    return when {
        url.contains(BuildConfig.BASE_URL) -> url
        url.startsWith("/") -> BuildConfig.BASE_URL + url.drop(1)
        else -> BuildConfig.BASE_URL + url
    }
}