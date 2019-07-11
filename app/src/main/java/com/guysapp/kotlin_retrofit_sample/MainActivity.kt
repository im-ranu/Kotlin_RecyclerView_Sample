package com.guysapp.kotlin_retrofit_sample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btFetch.setOnClickListener{
            val i = Intent(this@MainActivity,UserActivity::class.java)
            startActivity(i)
        }
    }
}
