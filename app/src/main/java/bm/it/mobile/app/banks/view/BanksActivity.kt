package bm.it.mobile.app.banks.view

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import bm.it.mobile.app.banks.view.ui.BanksView
import bm.it.mobile.app.banks.viewModel.BanksViewModel
import bm.it.mobile.app.banks.viewModel.BanksViewModelFactory

class BanksActivity: AppCompatActivity(), BanksEvents {

    private lateinit var view: BanksView
    private lateinit var viewModel: BanksViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initViewModel()
        initView()
        fetchItems()

        setContent {
            view.SetUpView()
        }
    }

    private fun initViewModel() {
        val factory = BanksViewModelFactory()
        viewModel = ViewModelProvider(this, factory).get(BanksViewModel::class.java)
    }

    private fun initView() {
        view = BanksView(viewModel, this)
    }

    private fun fetchItems() {
        viewModel.fetchBanks()
    }
}
