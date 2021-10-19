package bm.it.mobile.app.banks.repository

import bm.it.mobile.app.banks.model.BankModel
import kotlinx.coroutines.delay

class BanksRepositoryImpl : BanksRepository {

    override suspend fun fetchBanks(): MutableList<BankModel> {
        delay(2000L)

        val list = mutableListOf<BankModel>()
        list.add(BankModel("Itaú Unibanco", "0341", "60701190"))
        list.add(BankModel("Caixa Economica Federal", "0104", "00360305"))
        list.add(BankModel("Banco Bradesco", "0237", "60746948"))
        list.add(BankModel("Banco do Brasil", "0001", "0000000"))
        list.add(BankModel("Banco Santander", "0033", "90400888"))
        list.add(BankModel("Nubank Pagamentos", "0260", "18236120"))
        list.add(BankModel("Banco Inter", "0422", "00416968"))
        list.add(BankModel("Banco Safra", "0077", "58160789"))
        list.add(BankModel("Banco Sicoob", "0756", "02038232"))
        list.add(BankModel("XP Investimentos", "0102", "02332886"))
        list.add(BankModel("Banco Original", "0212", "92894922"))
        return list
    }
}
