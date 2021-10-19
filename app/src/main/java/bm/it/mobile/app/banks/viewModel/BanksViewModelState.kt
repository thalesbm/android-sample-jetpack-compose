package bm.it.mobile.app.banks.viewModel

import bm.it.mobile.app.banks.model.BankModel

data class BanksViewModelState(
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val list: List<BankModel> = mutableListOf()
)
