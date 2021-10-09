package bm.it.mobile.commons.viewModel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlin.coroutines.CoroutineContext

open class BaseViewModel : ViewModel(), CoroutineScope {

    private val viewModelJob = SupervisorJob()

    override val coroutineContext: CoroutineContext = Dispatchers.Main + viewModelJob
}
