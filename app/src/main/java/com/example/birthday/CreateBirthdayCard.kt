package com.example.birthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_create_birthday_card.*

class CreateBirthdayCard : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_birthday_card)

        val name = intent.getStringExtra(NAME_EXTRA)
        BirthdayGreeting.text="Happy Bithday\n$name!"
    }
}