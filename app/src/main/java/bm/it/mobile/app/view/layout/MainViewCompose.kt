package bm.it.mobile.app.view.layout

import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.graphics.Color
import bm.it.mobile.app.viewModel.MainViewModel

class MainViewCompose(private val viewModel: MainViewModel) {

    @Composable
    fun SetUpView() {
        val uiState = viewModel.viewState.observeAsState()

        Column {
            SetAppBar()


//            Row(Modifier.padding(Dp(20F))) {
//                Column {
//                    Text("Nome")
//                    Text("Olá Mundo!")
//                }
//
//                Column {
//                    Text("Olá Mundo!")
//
//                    Button(
//                        onClick = ::button,
//                        colors = ButtonDefaults.textButtonColors(
//                            backgroundColor = Color.DarkGray
//                        )
//                    ) {
//                        Text("Button")
//                    }
//                }
//            }
        }
    }

    @Composable
    private fun SetAppBar() {
        TopAppBar(
            title = { SetAppBarText() }
        )
    }

    @Composable
    private fun SetAppBarText() = Text(
        text = "Jetpack Compose"
    )

    private fun button() {

    }
}
