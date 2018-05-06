package com.example.harold.myapplication.InfluencersReport

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import com.example.harold.myapplication.R
import kotlinx.android.synthetic.main.activity_influencer_reports.*

class InfluencerReports : AppCompatActivity() {

    private val recipe = ArrayList<InfluencerModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_influencer_reports)

        val mLayoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        recipe.add(InfluencerModel(R.drawable.ic_launcher_background, "Jomie Hospital", "123465789"))
        recipe.add(InfluencerModel(R.drawable.ic_launcher_background, "Jomie Hospital", "123465789"))
        recipe.add(InfluencerModel(R.drawable.ic_launcher_background, "Jomie Hospital", "123465789"))

        val mAdapter = InfluencerAdapter(recipe)
        recyclerInvfluencer.layoutManager = mLayoutManager
        recyclerInvfluencer.adapter = mAdapter
    }
}
