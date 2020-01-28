package com.airensoft.creator.livemolo_clone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.airensoft.creator.livemolo_clone.adapter.MyFragmentPagerAdapter
import com.airensoft.creator.livemolo_clone.fragment.Main_fragment
import com.airensoft.creator.livemolo_clone.fragment.ThreeFragment
import com.airensoft.creator.livemolo_clone.fragment.TwoFragment
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var viewpager: ViewPager
    private lateinit var tabs: TabLayout
    private lateinit var SearchResult: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(topView)

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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflate = menuInflater
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.search -> {
                editText_search.visibility = View.VISIBLE
                SearchResult = editText_search.text.toString()
                Log.d("SearchTest", "${SearchResult}")
                return true
            }
            else -> {
                return super.onOptionsItemSelected(item)
            }
        }
    }

}
