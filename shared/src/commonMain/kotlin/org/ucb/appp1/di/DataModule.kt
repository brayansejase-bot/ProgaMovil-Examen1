package org.ucb.appp1.di

import org.koin.dsl.module
import org.ucb.appp1.Cryptomonedas.data.datasource.CryptoRemoteDataSource
import org.ucb.appp1.Cryptomonedas.data.repository.CryptoRepositoryImpl
import org.ucb.appp1.Cryptomonedas.data.service.CryptoApiService
import org.ucb.appp1.Cryptomonedas.domain.repository.CryptoRepository

val dataModule = module {
    single<CryptoRemoteDataSource> { CryptoApiService() }
    single<CryptoRepository> { CryptoRepositoryImpl(get()) }
}
