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

    init {
        fetchMenu()
    }

    private fun fetchMenu() {
        launch {
            when (val result = interactor.fetchMenu()) {
                is MenuInteractorState.List -> updateList(result.list)
            }
        }
    }

    private fun updateList(list: MutableList<String>) {
        _state.value = MenuViewModelState(list = list)
    }
}