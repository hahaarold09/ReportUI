package com.example.harold.myapplication.InfluencersReport

import android.content.Intent
import android.support.constraint.ConstraintLayout
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.harold.myapplication.CampaignReports
import com.example.harold.myapplication.R

class InfluencerAdapter(private val campaignList: ArrayList<InfluencerModel>): RecyclerView.Adapter<CustomViewHolder1>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder1 {
        val rootView = LayoutInflater.from(parent.context).inflate(R.layout.influencer_reports_list_layout,parent,false)
        return CustomViewHolder1(rootView)
    }

    override fun getItemCount(): Int {
        return campaignList.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder1, position: Int) {
        holder.tvTitle.text = campaignList[position].campName
        holder.tvCategory.text = campaignList[position].campCategory

        holder.tvCampaignLayout?.setOnClickListener { v ->
            val intent = Intent(v?.context, CampaignReports::class.java)
            intent.putExtra("name",campaignList[position].campName)
            intent.putExtra("category",campaignList[position].campCategory)
            v?.context?.startActivity(intent)
        }
    }

}
class CustomViewHolder1(val view: View): RecyclerView.ViewHolder(view){

    val tvTitle  = view.findViewById<TextView>(R.id.campaignTitle)
    val tvCategory  = view.findViewById<TextView>(R.id.campaignCategory)
    val tvCampaignLayout  = view.findViewById<ConstraintLayout>(R.id.viewCampaign)




}