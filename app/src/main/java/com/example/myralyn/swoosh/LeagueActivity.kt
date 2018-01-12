package com.example.myralyn.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_league.*
import kotlinx.android.synthetic.main.activity_welcome.*

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
    fun leagueNextClicked (view: View){
        //create an intent skillActivity and pass the destination which is the SkillAactivity class
        val skillActivity = Intent(this,SkillActivity::class.java)
        //then we start the intent
        startActivity(skillActivity)
    }
}
