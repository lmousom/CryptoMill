package com.mousom.cryptomill.domain.repository

import com.mousom.cryptomill.data.remote.dto.CoinDetailDto
import com.mousom.cryptomill.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}