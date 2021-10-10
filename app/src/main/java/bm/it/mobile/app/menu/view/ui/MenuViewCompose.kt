package bm.it.mobile.app.menu.view.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.ArrowForwardIos
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import bm.it.mobile.app.menu.viewModel.MenuViewModel
import bm.it.mobile.app.menu.viewModel.MenuViewModelState
import bm.it.mobile.commons.layout.Theme

class MenuViewCompose(private val viewModel: MenuViewModel) {

    @Composable
    fun SetUpView() {
        Theme.SetCustomTheme {
            UpdateView()
        }
    }

    @Composable
    private fun UpdateView() {
        val currentState: State<MenuViewModelState> = viewModel.viewState.collectAsState()

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color.White)
        ) {
            SetAppBar()
            SetTitle()
            Spacer(modifier = Modifier.height(16.dp))
            Divider(color = Color.Gray, thickness = 1.dp)
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

    @Composable
    private fun SetTitle() {
        Text(
            text = "Arquitetura MVVM com Compose",
            color = Color.Gray,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(Dp(0F), Dp(16F), Dp(0F), Dp(0F))
        )
    }

    @Composable
    private fun SetList(options: List<String>) {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            items(options) {
                DisplayList(item = it)
                Divider(color = Color.Gray, thickness = 1.dp)
            }
        }
    }

    @Composable
    private fun DisplayList(item: String) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(Dp(16F))
                .fillMaxWidth()
        ) {
            Text(
                text = item,
                color = Color.Gray,
                fontSize = 14.sp,
            )
            Row(
                horizontalArrangement = Arrangement.End,
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                Icon(
                    imageVector = Icons.Sharp.ArrowForwardIos,
                    contentDescription = null,
                    tint = Color.Gray,
                    modifier = Modifier
                        .height(Dp(20F))
                        .width(Dp(20F))
                )
            }
        }
    }
}
