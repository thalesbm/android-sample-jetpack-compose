package bm.it.mobile.app.view.layout

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import bm.it.mobile.app.viewModel.MainViewModel

class MainViewCompose(private val viewModel: MainViewModel) {

    @Composable
    fun setUpView() {
        Text("Hello world!")
    }
}
