package bm.it.mobile.app.view.layout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import bm.it.mobile.app.viewModel.MainViewModel

class MainViewCompose(private val viewModel: MainViewModel) {

    @Composable
    fun setUpView() {
        Row(Modifier.padding(Dp(20F))) {
            Column {
                Text("Nome")
                Text("Olá Mundo!")
            }

            Column {
                Text("Olá Mundo!")

                Button(
                    onClick = ::button,
                    colors = ButtonDefaults.textButtonColors(
                        backgroundColor = Color.DarkGray
                    )
                ) {
                    Text("Button")
                }
            }
        }
    }

    private fun button() {

    }
}
