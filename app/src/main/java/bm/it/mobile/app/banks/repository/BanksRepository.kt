package bm.it.mobile.app.banks.repository

import bm.it.mobile.app.banks.model.BankModel

interface BanksRepository {

    suspend fun fetchBanks(): MutableList<BankModel>
}
