package bm.it.mobile.app.banks.view.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import bm.it.mobile.app.banks.view.BanksEvents
import bm.it.mobile.app.banks.viewModel.BanksViewModel
import bm.it.mobile.commons.components.Theme
import bm.it.mobile.commons.components.Toolbar

class BanksView(
    private val viewModel: BanksViewModel,
    private val events: BanksEvents
) {

    @Composable
    fun SetUpView() {
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
                    Toolbar.SetAppBar()

                    when {
                        state.list.isNotEmpty() -> {
//                            SetTitle()
//                            UpdateList(state.list, events)
                        }
                        state.isLoading -> {
//                            ShowLoading()
                        }
                        state.isError -> {
//                            DisplayError(events)
                        }
                    }
                }
            }
        }
    }
}
