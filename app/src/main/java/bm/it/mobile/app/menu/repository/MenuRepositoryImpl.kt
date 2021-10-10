package bm.it.mobile.app.menu.repository

class MenuRepositoryImpl : MenuRepository {

    override fun fetchMenu(): MutableList<String> {
        val list = mutableListOf<String>()
        list.add("Arquitetura em Tela Simples")
        list.add("Arquitetura em Lista")
        return list
    }
}
