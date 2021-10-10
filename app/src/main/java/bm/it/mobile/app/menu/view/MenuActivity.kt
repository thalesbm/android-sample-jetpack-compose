package bm.it.mobile.app.menu.view

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import bm.it.mobile.app.menu.view.ui.MenuViewCompose
import bm.it.mobile.app.menu.viewModel.MenuViewModel
import bm.it.mobile.app.menu.viewModel.MenuViewModelFactory

class MenuActivity : AppCompatActivity() {

    private lateinit var viewModel: MenuViewModel
    private lateinit var compose: MenuViewCompose

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initViewModel()

        setContent {
            compose.SetUpView()
        }
    }

    private fun initViewModel() {
        val factory = MenuViewModelFactory()
        viewModel = ViewModelProvider(this, factory).get(MenuViewModel::class.java)
        compose = MenuViewCompose(viewModel)
    }
}
