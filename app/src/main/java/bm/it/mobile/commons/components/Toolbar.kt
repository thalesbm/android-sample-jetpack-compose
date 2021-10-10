package bm.it.mobile.commons.components

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable

object Toolbar {

    @Composable
    fun SetAppBar() {
        TopAppBar(
            title = { SetAppBarText() }
        )
    }

    @Composable
    private fun SetAppBarText() = Text(
        text = "Jetpack Compose"
    )
}
