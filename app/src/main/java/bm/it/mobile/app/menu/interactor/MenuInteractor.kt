package bm.it.mobile.app.menu.interactor

interface MenuInteractor {

    suspend fun fetchMenu(): MenuInteractorState
}