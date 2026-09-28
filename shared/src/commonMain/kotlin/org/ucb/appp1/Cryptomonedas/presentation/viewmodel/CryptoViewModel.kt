package org.ucb.appp1.Cryptomonedas.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.ucb.appp1.Cryptomonedas.domain.model.CryptoModel
import org.ucb.appp1.Cryptomonedas.domain.usercase.GetCryptos

data class CryptoUiState(
    val isLoading: Boolean = false,
    val cryptos: List<CryptoModel> = emptyList(),
    val error: String? = null
)

class CryptoViewModel(
    private val getCryptos: GetCryptos
) : ViewModel() {

    private val _uiState = MutableStateFlow(CryptoUiState())
    val uiState: StateFlow<CryptoUiState> = _uiState.asStateFlow()

    init {
        loadCryptos()
    }

    fun loadCryptos() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, error = null) }
            val result = getCryptos()
            result.fold(
                onSuccess = { cryptos ->
                    _uiState.update { it.copy(isLoading = false, cryptos = cryptos) }
                },
                onFailure = { error ->
                    _uiState.update { it.copy(isLoading = false, error = error.message ?: "Unknown error") }
                }
            )
        }
    }
}
