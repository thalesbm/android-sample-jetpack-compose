package bm.it.mobile.app.banks.viewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import bm.it.mobile.app.banks.interactor.BanksInteractor
import bm.it.mobile.app.banks.interactor.BanksInteractorState
import bm.it.mobile.app.banks.model.BankModel
import bm.it.mobile.commons.viewModel.BaseViewModel
import kotlinx.coroutines.launch

class BanksViewModel(private val interactor: BanksInteractor) : BaseViewModel() {

    private val _state = mutableStateOf(BanksViewModelState())
    val state: State<BanksViewModelState> = _state

    fun fetchBanks() {
        launch {
            _state.value = BanksViewModelState(isLoading = true)

            val result = interactor.fetchBanks()
            handleFetchBanks(result)
        }
    }

    private fun handleFetchBanks(result: BanksInteractorState) {
        when (result) {
            is BanksInteractorState.List -> updateList(result.list)
            is BanksInteractorState.Error -> displayErrorPage()
        }
    }

    private fun updateList(list: MutableList<BankModel>) {
        _state.value = BanksViewModelState(list = list, isLoading = false)
    }

    private fun displayErrorPage() {
        _state.value = BanksViewModelState(isError = true, isLoading = false)
    }
}
