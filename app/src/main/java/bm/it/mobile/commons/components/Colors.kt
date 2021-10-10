package bm.it.mobile.commons.components

import androidx.compose.ui.graphics.Color

object Colors {

    const val ORANGE = "#FF7200"
    const val ORANGE_DARK = "#E66700"

    fun getColor(color: String): Color {
        return Color(android.graphics.Color.parseColor(color))
    }
}
