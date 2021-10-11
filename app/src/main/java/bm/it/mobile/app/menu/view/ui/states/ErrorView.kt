package bm.it.mobile.app.menu.view.ui.states

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ReportGmailerrorred
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import bm.it.mobile.app.menu.view.MenuEvents
import bm.it.mobile.commons.components.Colors

@Composable
fun DisplayError(events: MenuEvents) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Icon(
            imageVector = Icons.Rounded.ReportGmailerrorred,
            contentDescription = null,
            tint = Colors.getColor(Colors.DARK_ORANGE),
            modifier = Modifier
                .height(Dp(180F))
                .width(Dp(180F))
                .weight(2F)
        )

        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1.5F)
        ) {
            Text(
                text = "ops...",
                fontSize = 26.sp,
                color = Colors.getColor(Colors.DARK_GRAY),
                textAlign = TextAlign.Center,
            )

            Text(
                text = "ocorreu um erro inesperado, tente novamente mais tarde",
                fontSize = 14.sp,
                color = Colors.getColor(Colors.DARK_GRAY),
                textAlign = TextAlign.Center,
            )
        }

        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Button(
                onClick = { events.pressedTriedAgain() },
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text("Tentar Novamente")
            }
        }
    }
}