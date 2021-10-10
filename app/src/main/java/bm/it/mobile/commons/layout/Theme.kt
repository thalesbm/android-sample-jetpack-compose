package bm.it.mobile.commons.layout

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import bm.it.mobile.commons.layout.Colors.getColor

object Theme {

    @Composable
    fun SetCustomTheme(
        darkTheme: Boolean = isSystemInDarkTheme(),
        content: @Composable () -> Unit
    ) {
        MaterialTheme(
            colors = if (darkTheme) {
                DarkColorPalette
            } else {
                LightColorPalette
            },
            content = content
        )
    }

    private val DarkColorPalette = darkColors(
        primary = getColor("FF7200"),
        primaryVariant = getColor("E66700"),
        secondary = getColor("FF7200")
    )

    private val LightColorPalette = lightColors(
        primary = getColor("FF7200"),
        primaryVariant = getColor("E66700"),
        secondary = getColor("FF7200")
    )
}
