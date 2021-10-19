package bm.it.mobile.app.banks.view.ui.states

import androidx.compose.foundation.Image
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import bm.it.mobile.app.R
import bm.it.mobile.app.banks.model.BankModel
import bm.it.mobile.app.banks.view.BanksEvents
import bm.it.mobile.commons.components.Colors

@Composable
fun DisplayBanks(options: List<BankModel>, events: BanksEvents) {
    SetList(options, events)
}

@Composable
private fun SetList(options: List<BankModel>, events: BanksEvents) {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        itemsIndexed(items = options, itemContent = { position, dataItem ->
            DisplayItem(item = dataItem, position, events)
        })
    }
}

@Composable
private fun DisplayItem(item: BankModel, position: Int, events: BanksEvents) {
    var icon = R.drawable.ic_company
    if (position == 0) {
        icon = R.drawable.ic_company_itau
    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                // events.pressedItem(position)
            }
    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(icon), null,
                modifier = Modifier
                    .height(32.dp)
                    .width(32.dp)
            )
        }

        Column {
            Text(
                text = item.name,
                color = Color.Black,
                fontSize = 18.sp,
            )
            Text(
                text = item.code + " | " + item.ispb,
                color = Color.Gray,
                fontSize = 14.sp,
            )
        }

        Row(
            horizontalArrangement = Arrangement.End,
            modifier = Modifier
                .fillMaxWidth(),
        ) {
            Icon(
                imageVector = Icons.Sharp.ArrowForwardIos,
                contentDescription = null,
                tint = Colors.getColor(Colors.ORANGE),
                modifier = Modifier
                    .padding(16.dp)
                    .height(16.dp)
                    .width(16.dp)
            )
        }
    }
}
