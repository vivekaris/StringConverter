package com.iotwebplanet.learn.coverter

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            val toolbar = findViewById(R.id.toolbar) as Toolbar
            setSupportActionBar(toolbar)

               val fab = findViewById(R.id.fab) as FloatingActionButton
                fab.setOnClickListener { view ->
                    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show()
                }

    //typecast edittext to kotlin

    //val variable_name=findViewById(R.id.<your view name>) as OriginalViewType

    var et=findViewById(R.id.myname) as EditText

    //covert button to kotlin
    val button =findViewById(R.id.mybutton) as Button

    //covert textview to kotlin
    val tv=findViewById(R.id.msg) as TextView

    //covert textview to kotlin
    val tv1=findViewById(R.id.msg2) as TextView

    button.setOnClickListener(View.OnClickListener {


    tv.setText(et.text.toString().toUpperCase())

    tv1.setText(et.text.toString().toLowerCase())

    Toast.makeText(this,"Button clicked",Toast.LENGTH_LONG).show()


            })

        }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId

        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}
