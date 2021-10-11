package bm.it.mobile.app.menu.view.ui.states

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import bm.it.mobile.commons.components.Colors

@Composable
fun SetTitle() {
    Text(
        text = "Arquitetura MVVM com Compose",
        color = Colors.getColor(Colors.DARK_GRAY),
        textAlign = TextAlign.Center,
        fontSize = 20.sp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(Dp(0F), Dp(16F), Dp(0F), Dp(0F))
    )
    Spacer(modifier = Modifier.height(16.dp))
}
