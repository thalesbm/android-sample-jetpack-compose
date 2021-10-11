package bm.it.mobile.app.menu.view.ui.states

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import bm.it.mobile.app.menu.view.MenuEvents

@Composable
fun DisplayError(events: MenuEvents) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        Button(onClick = { events.pressedTriedAgain() }) {

        }
    }
}