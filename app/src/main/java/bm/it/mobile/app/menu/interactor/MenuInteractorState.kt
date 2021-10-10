package bm.it.mobile.app.menu.interactor

sealed class MenuInteractorState {

    data class List(val list: MutableList<String>) : MenuInteractorState()
    object Error : MenuInteractorState()
}
