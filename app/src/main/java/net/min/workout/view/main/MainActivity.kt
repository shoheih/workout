package net.min.workout.view.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import net.min.workout.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .replace(R.id.screen_container, MainFragment())
                .commit()
        }

        
    }
}