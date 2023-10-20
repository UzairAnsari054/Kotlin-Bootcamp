package com.example.kotlinbootcamp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}

//git config user.email  -> To check github email
//git config user.name  -> To check github user name
//git config user.name "email"  -> To point to specific github email
//git config user.name "name" -> To point to specific github user name