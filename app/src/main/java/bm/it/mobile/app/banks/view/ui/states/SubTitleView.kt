package bm.it.mobile.app.banks.view.ui.states

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SetTitle(title: String) {
    Text(
        text = title,
        color = Color.Gray,
        fontSize = 14.sp,
        modifier = Modifier.padding(16.dp)
    )
}
