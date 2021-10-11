package bm.it.mobile.app.menu.view.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import bm.it.mobile.app.menu.view.MenuEvents
import bm.it.mobile.app.menu.view.ui.states.DisplayError
import bm.it.mobile.app.menu.view.ui.states.SetTitle
import bm.it.mobile.app.menu.view.ui.states.ShowLoading
import bm.it.mobile.app.menu.view.ui.states.UpdateList
import bm.it.mobile.app.menu.viewModel.MenuViewModel
import bm.it.mobile.commons.components.Theme
import bm.it.mobile.commons.components.Toolbar.SetAppBar

class MenuView(
    private val viewModel: MenuViewModel,
    private val events: MenuEvents
) {

    @Composable
    fun SetUpView() {
        // entender como essa linha é responsavel por escutar as alteraçoes dos states
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
                        SetTitle()
                        UpdateList(state.list, events)
                    }
                    state.isLoading -> {
                        ShowLoading()
                    }
                    state.isError -> {
                        DisplayError(events)
                    }
                }
            }
        }
    }
}
