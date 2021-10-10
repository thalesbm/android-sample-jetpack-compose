package bm.it.mobile.commons.components

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import bm.it.mobile.commons.components.Colors.ORANGE
import bm.it.mobile.commons.components.Colors.ORANGE_DARK
import bm.it.mobile.commons.components.Colors.getColor

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
        primary = getColor(ORANGE),
        primaryVariant = getColor(ORANGE_DARK),
        secondary = getColor(ORANGE)
    )

    private val LightColorPalette = lightColors(
        primary = getColor(ORANGE),
        primaryVariant = getColor(ORANGE_DARK),
        secondary = getColor(ORANGE)
    )
}
