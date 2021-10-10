package bm.it.mobile.app.menu.repository

interface MenuRepository {

    fun fetchMenu(): MutableList<String>
}