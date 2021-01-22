package com.example.android.todoapplication

import android.graphics.Typeface
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.marginBottom
import kotlinx.android.synthetic.main.activity_main.*









class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var todo = hashMapOf<Int,String>()
        var todoDesc = hashMapOf<Int,String>()
        var myButtons = ArrayList<Button>()
        var linearlayt = LinearLayout(this@MainActivity)
//        linearlayt.orientation(1)
        var i = 1
        scrollView2.addView(linearlayt)
        bt.setOnClickListener {
            todo [i]= et.text.toString()
            todoDesc [i]= etdesc.text.toString()
            var result : String = "Your ToDo List is as follows :"
            tv.text=result
            var btnView = Button(this@MainActivity)
            btnView.text = todo[i]
            myButtons.add(btnView)
            linearlayt.addView(btnView)
            et.text.clear()
            i += 1
        }
        btclear.setOnClickListener {
            scrollView2.removeView(linearlayt)
            linearlayt = LinearLayout(this@MainActivity)
            scrollView2.addView(linearlayt)
            et.text.clear()
            myButtons = ArrayList<Button>()
            todo = hashMapOf<Int,String>()
            todoDesc = hashMapOf<Int,String>()
            i=1
        }
    }
}






