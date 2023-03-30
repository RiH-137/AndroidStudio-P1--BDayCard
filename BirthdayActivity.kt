package com.example.capt_rih

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayActivity : AppCompatActivity() {
    companion object{                                   //companion object just create a static variable

        const val NAME_EXTRA ="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday)

        /* In general we use -->  val name  =intent.getStringExtra("name") <-- and here "name" is a key but if "name" key may change
        so we use companion object in LINE 8 and instead of using "name" we change to "NAME_EXTRA"
         And we have to change in both MainActivity and BirthdayActivity */

        val name=intent.getStringExtra("name_extra")
        //activity_birthday_id.text="Happy BirthDay $name!"
        var txtview : TextView=findViewById(R.id.activity_birthday_id)
        txtview.text="Happy Birthday ${intent.getStringExtra(name)} ..... !"


    }


}
#maintain code clear with comments
