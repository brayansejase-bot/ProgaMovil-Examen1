package org.ucb.appp1.Cryptomonedas.domain.usercase

import org.ucb.appp1.Cryptomonedas.domain.model.CryptoModel
import org.ucb.appp1.Cryptomonedas.domain.repository.CryptoRepository

class GetCryptos(
    val repository: CryptoRepository
) {
    suspend operator fun invoke(): Result<List<CryptoModel>> {
        return repository.getCryptos()
    }
}
