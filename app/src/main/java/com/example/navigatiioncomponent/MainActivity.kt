package com.example.navigatiioncomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.navigatiioncomponent.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       val binding=DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)

        val navController=this.findNavController(R.id.myNavHostFragment)

        //To link Navigation UI with actionbar by calling
        NavigationUI.setupActionBarWithNavController(this,navController)

    }

    override fun onSupportNavigateUp(): Boolean {
       val navController=this.findNavController(R.id.myNavHostFragment)
        return navController.navigateUp()
    }
}
