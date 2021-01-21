package com.example.android.todoapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var result : String = "Your ToDo List is as follows : "
        bt.setOnClickListener {
            result = result + "\n" + et.text.toString()
            tv.text=result
            et.text.clear()
        }
    }
}