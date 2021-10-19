package bm.it.mobile.app.banks.repository

interface BanksRepository {

    suspend fun fetchBanks(): MutableList<String>
}
