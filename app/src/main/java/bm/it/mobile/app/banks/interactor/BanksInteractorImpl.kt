package bm.it.mobile.app.banks.interactor

import bm.it.mobile.app.banks.repository.BanksRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlin.random.Random

class BanksInteractorImpl(private val repository: BanksRepository) : BanksInteractor {

    override suspend fun fetchBanks() = withContext(Dispatchers.Default) {
        val list = repository.fetchBanks()

        if (Random.nextBoolean()) {
            BanksInteractorState.List(list)
        } else {
            BanksInteractorState.Error
        }
    }
}