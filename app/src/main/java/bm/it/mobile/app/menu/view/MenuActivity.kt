package bm.it.mobile.app.menu.view

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import bm.it.mobile.app.menu.view.ui.MenuView
import bm.it.mobile.app.menu.viewModel.MenuViewModel
import bm.it.mobile.app.menu.viewModel.MenuViewModelFactory

class MenuActivity : AppCompatActivity() {

    private lateinit var viewModel: MenuViewModel
    private lateinit var view: MenuView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initViewModel()
        initView()
        fetchItems()

        setContent {
            view.SetUpView()
        }
    }

    private fun initViewModel() {
        val factory = MenuViewModelFactory()
        viewModel = ViewModelProvider(this, factory).get(MenuViewModel::class.java)
    }

    private fun initView() {
        view = MenuView(viewModel)
    }

    private fun fetchItems() {
        viewModel.fetchMenu()
    }
}
