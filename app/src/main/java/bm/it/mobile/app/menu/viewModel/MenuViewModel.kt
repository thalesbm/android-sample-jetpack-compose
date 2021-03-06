package bm.it.mobile.app.menu.viewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import bm.it.mobile.app.menu.interactor.MenuInteractor
import bm.it.mobile.app.menu.interactor.MenuInteractorState
import bm.it.mobile.commons.viewModel.BaseViewModel
import kotlinx.coroutines.launch

class MenuViewModel(private val interactor: MenuInteractor) : BaseViewModel() {

    private val _state = mutableStateOf(MenuViewModelState())
    val state: State<MenuViewModelState> = _state

    fun fetchMenu() {
        launch {
            _state.value = MenuViewModelState(isLoading = true)

            val result = interactor.fetchMenu()
            handleFetchMenu(result)
        }
    }

    private fun handleFetchMenu(result: MenuInteractorState) {
        when (result) {
            is MenuInteractorState.List -> updateList(result.list)
            is MenuInteractorState.Error -> displayErrorPage()
        }
    }

    private fun updateList(list: MutableList<String>) {
        _state.value = MenuViewModelState(list = list, isLoading = false)
    }

    private fun displayErrorPage() {
        _state.value = MenuViewModelState(isError = true, isLoading = false)
    }
}