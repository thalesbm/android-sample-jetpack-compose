package bm.it.mobile.app.menu.view.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import bm.it.mobile.app.menu.view.ui.states.DisplayError
import bm.it.mobile.app.menu.view.ui.states.ShowLoading
import bm.it.mobile.app.menu.view.ui.states.UpdateList
import bm.it.mobile.app.menu.viewModel.MenuViewModel
import bm.it.mobile.commons.components.Theme
import bm.it.mobile.commons.components.Toolbar.SetAppBar

class MenuView(private val viewModel: MenuViewModel) {

    @Composable
    fun SetUpView() {
        val state = viewModel.state.value

        Theme.SetCustomTheme {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(Color.White)
            ) {
                SetAppBar()

                when {
                    state.list.isNotEmpty() -> {
                        UpdateList(state.list)
                    }
                    state.isLoading -> {
                        ShowLoading()
                    }
                    state.isError -> {
                        DisplayError()
                    }
                }
            }
        }
    }
}
