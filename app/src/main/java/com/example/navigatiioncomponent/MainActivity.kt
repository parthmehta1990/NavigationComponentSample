package com.example.navigatiioncomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.navigatiioncomponent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       val binding=DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
    }
}
