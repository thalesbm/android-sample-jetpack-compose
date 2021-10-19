package bm.it.mobile.app.banks.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import bm.it.mobile.app.banks.interactor.BanksInteractorImpl
import bm.it.mobile.app.banks.repository.BanksRepositoryImpl

class BanksViewModelFactory: ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val repository = BanksRepositoryImpl()
        val interactor = BanksInteractorImpl(repository)
        return BanksViewModel(interactor) as T
    }
}
