package bm.it.mobile.app.banks.repository

import kotlinx.coroutines.delay

class BanksRepositoryImpl : BanksRepository {

    override suspend fun fetchBanks(): MutableList<String> {
        delay(2000L)

        val list = mutableListOf<String>()
        list.add("Santander")
        list.add("Itau")
        list.add("Nubank")
        list.add("C6")
        list.add("Bradesco")
        list.add("Caixa")
        list.add("PicPay")
        list.add("N26")
        return list
    }
}
