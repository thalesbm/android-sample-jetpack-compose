package bm.it.mobile.app.menu.view.ui.states

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ShowLoading() {
    CircularProgressIndicator(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth())
}
