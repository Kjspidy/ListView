package com.example.kjspidy.listview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var superheros = arrayOf("Iron Man ","Thor", "Spiderman", "Flash")

        //adapter has the data we add adapter to set data to view
        listview.adapter=ArrayAdapter<String>(this ,android.R.layout.simple_list_item_1,superheros )

        listview.setOnItemClickListener{ adapterView, view , i ,l->
        Toast.makeText(applicationContext,"You choose "+superheros[i],Toast.LENGTH_LONG)
        }
    }

}

