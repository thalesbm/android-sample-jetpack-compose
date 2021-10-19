package bm.it.mobile.app.banks.viewModel

data class BanksViewModelState(
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val list: List<String> = mutableListOf()
)
