package com.example.myralyn.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.myralyn.swoosh.Model.Player
import com.example.myralyn.swoosh.R

import com.example.myralyn.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onBeginnerClicked(view: View){
        ballerToggleBtn.isChecked=false
        player.skills="beginner"

    }

    fun onBallerClicked(view: View){
        beginnerToggleBtn.isChecked=false
        player.skills="baller"

    }

    fun onFinishClicked(view: View){
        if (player.skills != ""){
            //create intent to go on the FinishActivity, pass in (Context which is this, pass in targetActivity)
            val finishActivity = Intent(this, FinishActivity::class.java)
            //we want to send the skill to FinishActivity so we put it in the intent
            //we also want to sent the league data to FinishActivity
            finishActivity.putExtra(EXTRA_PLAYER, player)
            //then start the nextActivity FinishActivity
            startActivity(finishActivity)
        }else{
            //if user did not select a skill display a toast to make them choose
            Toast.makeText(this,getString(R.string.select_skill),Toast.LENGTH_SHORT).show()
        }
    }
}
