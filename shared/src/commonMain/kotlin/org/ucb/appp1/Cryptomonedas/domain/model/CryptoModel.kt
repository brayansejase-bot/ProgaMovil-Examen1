package org.ucb.appp1.Cryptomonedas.domain.model

data class CryptoModel (
    val name: String,
    val symbol: String,
    val image: String,
    val currentPrice: String,
    val priceChangePercentage24h: String,
    val marketCap: String,
    val marketCapRank: String
)