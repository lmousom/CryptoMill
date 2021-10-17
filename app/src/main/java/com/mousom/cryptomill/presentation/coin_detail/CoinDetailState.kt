package com.mousom.cryptomill.presentation.coin_detail

import com.mousom.cryptomill.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
