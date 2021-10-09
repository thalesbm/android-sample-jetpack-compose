package bm.it.mobile.app.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import bm.it.mobile.commons.viewModel.BaseViewModel

class MainViewModel : BaseViewModel() {

    private val state = MutableLiveData<MainViewModelState>()
    val viewState: LiveData<MainViewModelState> = state

    fun getItems() {
        val list = mutableListOf<String>()
        list.add("Tela Simples")
        list.add("Lista")
        state.value = MainViewModelState.GetList(list)
    }
}