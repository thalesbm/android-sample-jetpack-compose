package bm.it.mobile.app.banks.interactor

import bm.it.mobile.app.banks.model.BankModel

sealed class BanksInteractorState {

    data class List(val list: MutableList<BankModel>) : BanksInteractorState()
    object Error : BanksInteractorState()
}
