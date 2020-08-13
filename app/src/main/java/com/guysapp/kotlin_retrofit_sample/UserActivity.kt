package com.guysapp.kotlin_retrofit_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_user.*
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.DividerItemDecoration.VERTICAL
import kotlin.random.Random


class UserActivity : AppCompatActivity() {

    lateinit var userAdapter : UserAdapter
    val UserName : ArrayList<String> = ArrayList();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)


        setSupportActionBar(tbUserName)



        UserName.add("Ranjeet")
        UserName.add("Sandeep")
        UserName.add("Prakash")
        UserName.add("Vishal")
        UserName.add("Tushar")
        UserName.add("Sejal")
        UserName.add("Aayushi")

         userAdapter = UserAdapter(UserName, this)
        rvUserList.layoutManager = LinearLayoutManager(this)

        val itemDecor = DividerItemDecoration(this, VERTICAL)
        rvUserList.addItemDecoration(itemDecor)
        rvUserList.adapter = userAdapter


        button.setOnClickListener {
            userAdapter.addItem(getRandomString(7))
        }

    }

    fun getRandomString(length: Int) : String {
        val allowedChars = ('A'..'Z') + ('a'..'z')
        return (1..length)
            .map { allowedChars.random() }
            .joinToString("")
    }


}
