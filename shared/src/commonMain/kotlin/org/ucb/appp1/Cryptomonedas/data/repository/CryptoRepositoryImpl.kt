package org.ucb.appp1.Cryptomonedas.data.repository

import org.ucb.appp1.Cryptomonedas.data.datasource.CryptoRemoteDataSource
import org.ucb.appp1.Cryptomonedas.data.mapper.toDomain
import org.ucb.appp1.Cryptomonedas.domain.model.CryptoModel
import org.ucb.appp1.Cryptomonedas.domain.repository.CryptoRepository

class CryptoRepositoryImpl(val dataSource: CryptoRemoteDataSource): CryptoRepository {
    override suspend fun getCryptos(): Result<List<CryptoModel>> {
        return Result.success(dataSource.getCryptos().toDomain())
    }
}
