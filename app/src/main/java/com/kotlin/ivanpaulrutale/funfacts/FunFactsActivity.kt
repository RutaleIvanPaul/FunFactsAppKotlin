package com.kotlin.ivanpaulrutale.funfacts

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView

class FunFactsActivity : AppCompatActivity() {

    private val TAG = FunFactsActivity::class.java.simpleName
    // View Variables
    private var factTextView: TextView? = null
    private var showFactButton: Button? = null
    private var backGroundLayout: RelativeLayout? =null
    private val factBook = FactBook()
    private val colorWheel = ColorWheel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_facts)
        factTextView = findViewById(R.id.factTextView)
        showFactButton = findViewById(R.id.showFactButton)
        backGroundLayout = findViewById(R.id.RelativeLayout)
        nextFact()
        showFactButton!!.setOnClickListener{
            nextFact()
        }
        Log.d(TAG,"We're Logging from the OnCreate Method")
    }

    private fun nextFact() {
        factTextView!!.text = factBook .getFact()
        var color = colorWheel.getColor()
        backGroundLayout!!.setBackgroundColor(color)
        showFactButton!!.setTextColor(color)
    }
}
