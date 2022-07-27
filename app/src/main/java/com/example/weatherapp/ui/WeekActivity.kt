package com.example.weatherapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weatherapp.R
import kotlinx.android.synthetic.main.activity_week.*

class WeekActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_week)
        supportActionBar?.hide()

        rollback.setOnClickListener{
            finish()
        }
    }
}