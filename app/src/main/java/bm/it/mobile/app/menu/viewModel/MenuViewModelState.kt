package bm.it.mobile.app.menu.viewModel

data class MenuViewModelState(
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val list: List<String> = mutableListOf()
)
