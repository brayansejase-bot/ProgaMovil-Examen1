package org.ucb.appp1.Cryptomonedas.data.datasource


import org.ucb.appp1.Cryptomonedas.data.dto.CryptoDto
import org.ucb.appp1.Cryptomonedas.domain.model.CryptoModel

interface CryptoRemoteDataSource {
    suspend fun getCryptos() : List<CryptoDto>
}