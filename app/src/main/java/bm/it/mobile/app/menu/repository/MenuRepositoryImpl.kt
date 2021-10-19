package bm.it.mobile.app.menu.repository

import kotlinx.coroutines.delay

class MenuRepositoryImpl : MenuRepository {

    override suspend fun fetchMenu(): MutableList<String> {

        delay(2000L)

        val list = mutableListOf<String>()
        list.add("Lista de Bancos")
        list.add("---")
        return list
    }
}
