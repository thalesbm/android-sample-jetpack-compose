package bm.it.mobile.app.banks.interactor

sealed class BanksInteractorState {

    data class List(val list: MutableList<String>) : BanksInteractorState()
    object Error : BanksInteractorState()
}
