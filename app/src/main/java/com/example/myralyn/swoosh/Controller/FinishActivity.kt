package com.example.myralyn.swoosh.Controller

import android.os.Bundle
import com.example.myralyn.swoosh.Model.Player
import com.example.myralyn.swoosh.R
import com.example.myralyn.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val player=intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        search_league.text = "Looking for ${player.league} ${player.skills} league near you"
    }
}
