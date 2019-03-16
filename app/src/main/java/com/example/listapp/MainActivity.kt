package com.example.listapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.AdapterView
import android.widget.ArrayAdapter


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initializing a list of string
        val colors = listOf("Red", "Green", "Blue", "Yellow", "Black", "Crimson", "Orange")

        val color1 = Color(1, "Red", 0.5)
        val color2 = Color(1, "Green", 0.3)
        val color3 = Color(1, "Blue", 0.2)
        val color4 = Color(1, "Yellow", 0.4)

        //val colors = listOf<Color>(color1, color2, color3, color4)
        //val colors = ("yellow", "green", "blue")


        // Create an ArrayAdapter from List
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, colors)

        // Finally, data bind the list view object with adapter
        list_view.adapter = adapter;

        // Set an item click listener for ListView
        list_view.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            // Get the selected item text from ListView
            val selectedItem = parent.getItemAtPosition(position) as String

            // Display the selected item text on TextView
            text_view.text = "Your favorite color: $selectedItem"
        }
    }
}