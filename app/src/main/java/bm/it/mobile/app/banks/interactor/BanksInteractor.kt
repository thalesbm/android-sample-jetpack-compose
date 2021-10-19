package bm.it.mobile.app.banks.interactor

interface BanksInteractor {

    suspend fun fetchBanks(): BanksInteractorState
}