package org.ucb.appp1.Cryptomonedas.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsSymbol

@Serializable
data class CryptoDto(
    val name: String?=null,
    val symbol: String?=null,
    val image: String?=null,
    @SerialName("current_price")
    val currentPrice: String?=null,
    @SerialName("price_change_percentage_24h")
    val priceChangePercentage24h: String?=null,
    @SerialName("market_cap")
    val marketCap: String?=null,
    @SerialName("market_cap_rank")
    val marketCapRank: String?=null


)