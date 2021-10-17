package com.mousom.cryptomill.presentation.coin_list

import com.mousom.cryptomill.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
