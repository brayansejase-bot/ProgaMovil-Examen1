package org.ucb.appp1.Cryptomonedas.domain.repository

import org.ucb.appp1.Cryptomonedas.domain.model.CryptoModel

interface CryptoRepository {
    suspend fun getCryptos(): Result<List<CryptoModel>>
}