package bm.it.mobile.app.menu.view.ui.states

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.ArrowForwardIos
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import bm.it.mobile.app.menu.view.MenuEvents
import bm.it.mobile.commons.components.Colors

@Composable
fun UpdateList(options: List<String>, events: MenuEvents) {
    Divider(color = Colors.getColor(Colors.DARK_GRAY), thickness = 1.dp)
    SetList(options, events)
}

@Composable
private fun SetList(options: List<String>, events: MenuEvents) {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        itemsIndexed(items = options, itemContent = { position, dataItem ->
            DisplayItem(item = dataItem, position, events)
            Divider(color = Colors.getColor(Colors.DARK_GRAY), thickness = 1.dp)
        })
    }
}

@Composable
private fun DisplayItem(item: String, position: Int, events: MenuEvents) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                events.pressedItem(position)
            }
    ) {
        Text(
            text = item,
            color = Color.Gray,
            fontSize = 14.sp,
            modifier = Modifier.padding(16.dp)
        )
        Row(
            horizontalArrangement = Arrangement.End,
            modifier = Modifier
                .fillMaxWidth(),
        ) {
            Icon(
                imageVector = Icons.Sharp.ArrowForwardIos,
                contentDescription = null,
                tint = Colors.getColor(Colors.DARK_GRAY),
                modifier = Modifier
                    .padding(16.dp)
                    .height(20.dp)
                    .width(20.dp)
            )
        }
    }
}
