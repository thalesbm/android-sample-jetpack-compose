package bm.it.mobile.commons.components

import androidx.compose.ui.graphics.Color

object Colors {

    const val ORANGE = "#FF7200"
    const val DARK_ORANGE = "#E66700"
    const val DARK_GRAY = "#808080"

    fun getColor(color: String): Color {
        return Color(android.graphics.Color.parseColor(color))
    }
}
