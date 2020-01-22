package com.airensoft.creator.livemolo_clone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import androidx.viewpager.widget.ViewPager
import com.airensoft.creator.livemolo_clone.adapter.CastListStaggeredAdapter
import com.airensoft.creator.livemolo_clone.adapter.MyFragmentPagerAdapter
import com.airensoft.creator.livemolo_clone.fragment.Main_fragment
import com.airensoft.creator.livemolo_clone.fragment.ThreeFragment
import com.airensoft.creator.livemolo_clone.fragment.TwoFragment
import com.airensoft.creator.livemolo_clone.model.CastModel
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var viewpager: ViewPager
    private lateinit var tabs: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        setupViewPager()
    }

    private fun initView() {
        tabs = findViewById(R.id.tabs)
        viewpager = findViewById(R.id.viewpager)
    }

    private fun setupViewPager() {

        val adapter = MyFragmentPagerAdapter(getSupportFragmentManager())

        var firstFragmet: Main_fragment = Main_fragment.newInstance("First Fragment")
        var secondFragmet: TwoFragment = TwoFragment.newInstance("Second Fragment")
        var thirdFragmet: ThreeFragment = ThreeFragment.newInstance("Third Fragment")


        adapter.addFragment(firstFragmet, "Main")
        adapter.addFragment(secondFragmet, "TWO")
        adapter.addFragment(thirdFragmet, "THREE")

        viewpager!!.adapter = adapter

        tabs!!.setupWithViewPager(viewpager)

    }



}
