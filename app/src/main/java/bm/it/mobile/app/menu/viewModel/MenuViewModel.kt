package bm.it.mobile.app.menu.viewModel

import bm.it.mobile.app.menu.interactor.MenuInteractor
import bm.it.mobile.commons.viewModel.BaseViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MenuViewModel(private val interactor: MenuInteractor) : BaseViewModel() {

//    private val state = MutableLiveData<MainViewModelState>()
//    val viewState: LiveData<MainViewModelState> = state

    private val _viewState = MutableStateFlow(MenuViewModelState())
    val viewState: StateFlow<MenuViewModelState> = _viewState

    fun fetchMenu() {
        launch {
            val list = interactor.fetchMenu()
        }
    }
}