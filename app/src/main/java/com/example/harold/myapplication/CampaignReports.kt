package com.example.harold.myapplication

import android.graphics.Color
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.example.harold.myapplication.Reports.FragmentReports
import com.example.harold.myapplication.Reports.PagerAdapter
import kotlinx.android.synthetic.main.activity_campaign_reports.*

class CampaignReports : AppCompatActivity() {

    private lateinit var pagerAdapter: PagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_campaign_reports)
        setSupportActionBar(toolbar)



        pagerAdapter = PagerAdapter(supportFragmentManager)

        pagerAdapter.addFragments(FragmentReports(),"Product")
        pagerAdapter.addFragments(FragmentReports(),"Company")

        viewPager.adapter = pagerAdapter
        tabLayout.setupWithViewPager(viewPager)





    }
}
