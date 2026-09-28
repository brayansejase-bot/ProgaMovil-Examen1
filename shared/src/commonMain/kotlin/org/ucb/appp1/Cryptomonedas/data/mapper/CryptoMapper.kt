package org.ucb.appp1.Cryptomonedas.data.mapper

import org.ucb.appp1.Cryptomonedas.data.dto.CryptoDto
import org.ucb.appp1.Cryptomonedas.domain.model.CryptoModel

fun CryptoDto.toDomain(): CryptoModel = CryptoModel(
    name = name?:"",
    symbol = symbol?:"",
    image = image?:"",
    currentPrice = currentPrice?:"",
    priceChangePercentage24h = priceChangePercentage24h?:"",
    marketCap = marketCap?:"",
    marketCapRank = marketCapRank?:""
)
fun List<CryptoDto>.toDomain(): List<CryptoModel> {
    return this.map { it.toDomain() }
}