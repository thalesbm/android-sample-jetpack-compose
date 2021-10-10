package bm.it.mobile.app.menu.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import bm.it.mobile.app.menu.interactor.MenuInteractorImpl
import bm.it.mobile.app.menu.repository.MenuRepositoryImpl

class MenuViewModelFactory: ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val repository = MenuRepositoryImpl()
        val interactor = MenuInteractorImpl(repository)
        return MenuViewModel(interactor) as T
    }
}
