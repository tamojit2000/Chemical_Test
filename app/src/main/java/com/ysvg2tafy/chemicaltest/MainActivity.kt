package com.ysvg2tafy.chemicaltest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            var x=editText.text.toString()
            var y=editText2.text.toString()
            var ans=Balancer.balance(x+"="+y)
            textView.text=ans.toString()
        }

    }
}
