package com.example.myralyn.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.myralyn.swoosh.Model.Player
import com.example.myralyn.swoosh.R
import com.example.myralyn.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    //2.we set a variable so the selected for now it is empty string
    var player = Player("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }



    //3.add function here so that when each of the buttons, MENS, WOMENS, CO-ED are clicked the others are not
    fun onMensClicked (view: View){
        //we want to make sure that when MENS are clicked the 2 other buttons are not clicked
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        //4.when MENS button is selected we set the variable
        player.league = "mens"
    }

    fun onWomensClicked (view: View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "womens"

    }

    fun onCoedClicked (view: View){
        womensLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false
        player.league = "coed"

    }

    //1.)function so that when 'NEXT' button is clicked we transition to SkillActivity page
    fun leagueNextClicked (view: View){
        //we want that user selected either women, men, coed before clicking next so we put an if statement
        if(player.league != ""){
            //create an intent skillActivity and pass the destination which is the SkillAactivity class
            val skillActivity = Intent(this, SkillActivity::class.java)
            //note we have to fix EXTRA_LEAGUE unresolvale, sslect project path->new->kotlin class->name: Constants
            //then add: const val EXTRA_LEAGUE = "league"
            skillActivity.putExtra(EXTRA_PLAYER,player)
            //then we start the intent
            startActivity(skillActivity)
        }
        else{ //we need to show a toast - (oogle Toasts android to see usage), we want to show a message for a short period of time
            //we have to tell toast to run in this context and also we need to show the toast
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }

}
