package com.example.myralyn.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {
    //1.good practise declare a TAG for the log
    val TAG = "LifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        //2.each of the activity/app will be calling this BaseActivity so we are going to log the name the activity and
        //the method it is in.
        Log.d(TAG, "${javaClass.simpleName} OnCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onRestart() {
        Log.d(TAG, "${javaClass.simpleName} OnRestart")
        super.onRestart()
    }

    override fun onStart() {
        Log.d(TAG, "${javaClass.simpleName} OnStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "${javaClass.simpleName} OnResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "${javaClass.simpleName} OnPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "${javaClass.simpleName} OnStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "${javaClass.simpleName} OnDestroy")
        super.onDestroy()
    }


}
