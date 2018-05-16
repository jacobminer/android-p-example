package com.melonhead.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.melonhead.myapplication.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }

    override fun onSupportNavigateUp() = findNavController(R.id.my_nav_host_fragment).navigateUp()

}
