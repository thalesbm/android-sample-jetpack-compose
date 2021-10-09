package bm.it.mobile.commons.layout

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

object Theme {

    private val DarkColorPalette = darkColors(
        primary = Color.LightGray,
        primaryVariant = Color.Gray,
        secondary = Color.Yellow
    )

    @Composable
    fun SetCustomTheme(
        content: @Composable () -> Unit
    ) {

        MaterialTheme(
            colors = DarkColorPalette,
            content = content
        )
    }
}
