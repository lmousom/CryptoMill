package com.mousom.cryptomill.data.repository

import com.mousom.cryptomill.data.remote.CoinPaprikaApi
import com.mousom.cryptomill.data.remote.dto.CoinDetailDto
import com.mousom.cryptomill.data.remote.dto.CoinDto
import com.mousom.cryptomill.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}