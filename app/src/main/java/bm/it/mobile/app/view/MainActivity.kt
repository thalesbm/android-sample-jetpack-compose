package bm.it.mobile.app.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import bm.it.mobile.app.view.layout.MainViewCompose
import bm.it.mobile.app.viewModel.MainViewModel
import bm.it.mobile.commons.layout.Theme

class MainActivity : ComponentActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var compose: MainViewCompose

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()

        setContent {
            Theme.SetCustomTheme {
                compose.SetUpView()
            }
        }
    }

    private fun init() {
        viewModel = MainViewModel()
        compose = MainViewCompose(viewModel)
    }
}
