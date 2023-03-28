package com.example.capt_rih

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.capt_rih.R.id
import com.example.capt_rih.R.id.btn

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {  //to start first time
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btn(View:View){

        val name = findViewById<EditText>(R.id.editTextTextPersonName).editableText.toString()
        Toast.makeText(this, "Creating Birthday Card for $name", Toast.LENGTH_LONG).show()
        val intent = Intent(this, BirthdayActivity::class.java).also {
        //    intent.putExtra("name",name)             ----> here "name" is a key
            intent.putExtra(BirthdayActivity.NAME_EXTRA,name)     /*name_ extra from BirthdayActivity
            since name can we change */

            /*intent use for passing data as well as jump from one string to another string. */

        }
        startActivity(intent)


    }
}
