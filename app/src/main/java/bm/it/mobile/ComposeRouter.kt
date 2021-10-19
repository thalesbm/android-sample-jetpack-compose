package bm.it.mobile

import android.content.Context
import android.content.Intent
import bm.it.mobile.app.banks.view.BanksActivity

object ComposeRouter {

    fun goToBanks(context: Context) {
        val intent = Intent(context, BanksActivity::class.java)
        context.startActivity(intent)
    }
}
