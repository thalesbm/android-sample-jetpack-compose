package bm.it.mobile.app.menu.repository

interface MenuRepository {

    suspend fun fetchMenu(): MutableList<String>
}