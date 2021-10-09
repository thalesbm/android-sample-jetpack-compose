package bm.it.mobile.app.view.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import bm.it.mobile.app.viewModel.MainViewModel

class MainViewCompose(private val viewModel: MainViewModel) {

    @ExperimentalUnitApi
    @Composable
    fun SetUpView() {
        val uiState = viewModel.viewState.observeAsState()

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color.White)
        ) {
            SetAppBar()
            SetTitle()
            SetList(mutableListOf("sdasdas", "dasdsadas"))
        }
    }

    @Composable
    private fun SetAppBar() {
        TopAppBar(
            title = { SetAppBarText() }
        )
    }

    @Composable
    private fun SetAppBarText() = Text(
        text = "Jetpack Compose"
    )

    @ExperimentalUnitApi
    @Composable
    private fun SetTitle() {
        Text(
            text = "Arquitetura MVVM com Compose",
            color = Color.Gray,
            textAlign = TextAlign.Center,
            fontSize = TextUnit(20F, TextUnitType.Sp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(Dp(16F))
        )
    }

    @Composable
    private fun SetList(options: List<String>) {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(Dp(0F), Dp(16F), Dp(0F), Dp(0F))
        ) {
            items(options) {
                DisplayList(item = it)
            }
        }
    }

    @Composable
    private fun DisplayList(item: String) {
        Row(
            modifier = Modifier.padding(Dp(8F))
        ) {
            Text(
                text = item,
                color = Color.Gray,
            )
            Icon(
                imageVector = Icons.Outlined.ArrowRight,
                contentDescription = "",
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}
