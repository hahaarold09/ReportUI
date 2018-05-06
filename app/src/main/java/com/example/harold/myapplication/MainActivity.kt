package com.example.harold.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentTransaction
import com.example.harold.myapplication.Reports.FragmentReports

class MainActivity : AppCompatActivity() {

    private var mFragmentTransaction: FragmentTransaction?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = FragmentReports()
        mFragmentTransaction = supportFragmentManager.beginTransaction()
        mFragmentTransaction?.add(R.id.fragContainer, fragment,"Sample")
        mFragmentTransaction?.commit()


    }
}
