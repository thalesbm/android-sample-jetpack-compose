package bm.it.mobile.app.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import bm.it.mobile.app.view.layout.MainViewCompose
import bm.it.mobile.app.viewModel.MainViewModel

class MainActivity : ComponentActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val compose = MainViewCompose(viewModel)

        setContent {
            compose.setUpView()
        }
    }
}
