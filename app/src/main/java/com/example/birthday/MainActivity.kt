package com.example.birthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun CreateBirthdayCard(view: View) {
    val name = Name.editableText.toString();
//        Toast.makeText(this,"CreateBithdayCard$name",Toast.LENGTH_SHORT).show();

        val intent =Intent(this,CreateBirthdayCard::class.java)
        intent.putExtra(CreateBirthdayCard.NAME_EXTRA,name)
         startActivity(intent)
    }
}