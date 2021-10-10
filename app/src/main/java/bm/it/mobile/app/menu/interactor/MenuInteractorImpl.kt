package bm.it.mobile.app.menu.interactor

import bm.it.mobile.app.menu.repository.MenuRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MenuInteractorImpl(private val repository: MenuRepository) : MenuInteractor {

    override suspend fun fetchMenu() = withContext(Dispatchers.Default) {
        val list = repository.fetchMenu()
        MenuInteractorState.List(list)
    }
}