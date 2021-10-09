package bm.it.mobile.app.viewModel

sealed class MainViewModelState {

    data class GetList(val list: List<String>) : MainViewModelState()
}
