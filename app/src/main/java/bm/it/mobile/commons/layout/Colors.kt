package bm.it.mobile.commons.layout

import androidx.compose.ui.graphics.Color

object Colors {

    fun getColor(color: String): Color {
        return Color(android.graphics.Color.parseColor("#$color"))
    }
}