package com.example.harold.myapplication.Reports


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.harold.myapplication.R

class FragmentReports : Fragment() {

    private val recipe = ArrayList<ReportModel>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_fragment_reports, container, false)

        val recyclerView1 = view.findViewById<RecyclerView>(R.id.recyclerView)

        val mLayoutManager = LinearLayoutManager(this.activity, LinearLayout.VERTICAL, false)

        recipe.add(ReportModel(R.drawable.ic_launcher_background, "Harold", "Travel", "01/02/2018"))
        recipe.add(ReportModel(R.drawable.ic_launcher_background, "Harold", "Travel", "01/02/2018"))
        recipe.add(ReportModel(R.drawable.ic_launcher_background, "Harold", "Travel", "01/02/2018"))
        recipe.add(ReportModel(R.drawable.ic_launcher_background, "Harold", "Travel", "01/02/2018"))
        recipe.add(ReportModel(R.drawable.ic_launcher_background, "Harold", "Travel", "01/02/2018"))
        recipe.add(ReportModel(R.drawable.ic_launcher_background, "Harold", "Travel", "01/02/2018"))

        val mAdapter = Adapter(recipe)
        recyclerView1.layoutManager = mLayoutManager
        recyclerView1.adapter = mAdapter
        return view
    }


}
