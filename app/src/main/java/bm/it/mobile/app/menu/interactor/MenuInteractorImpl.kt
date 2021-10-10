package bm.it.mobile.app.menu.interactor

import bm.it.mobile.app.menu.repository.MenuRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlin.random.Random

class MenuInteractorImpl(private val repository: MenuRepository) : MenuInteractor {

    override suspend fun fetchMenu() = withContext(Dispatchers.Default) {
        val list = repository.fetchMenu()

        if (Random.nextBoolean()) {
            MenuInteractorState.List(list)
        } else {
            MenuInteractorState.Error
        }
    }
}