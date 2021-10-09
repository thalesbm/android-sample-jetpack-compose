package bm.it.mobile.app.view

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import bm.it.mobile.app.view.layout.MainViewCompose
import bm.it.mobile.app.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var compose: MainViewCompose

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()

        setContent {
            compose.SetUpView()
        }
    }

    private fun init() {
        viewModel = MainViewModel()
        compose = MainViewCompose(viewModel)
    }
}
