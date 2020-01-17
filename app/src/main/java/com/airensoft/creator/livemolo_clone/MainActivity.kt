package com.airensoft.creator.livemolo_clone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.airensoft.creator.livemolo_clone.adapter.CastListStaggeredAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        recyclerview.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        //This will for default android divider
        recyclerview.addItemDecoration(GridItemDecoration(10, 2))

        val castListAdapter =
            CastListStaggeredAdapter()
        recyclerview.adapter = castListAdapter
        castListAdapter.setMovieList(generateDummyData())
    }

    private fun generateDummyData(): List<CastModel> {
        val listOfCast = mutableListOf<CastModel>()

        var castModel = CastModel("caster1", "title test 1",1111, R.drawable.img_avatar3)
        listOfCast.add(castModel)

        castModel = CastModel("caster1", "title test 1",1111, R.drawable.img_avatar3)
        listOfCast.add(castModel)

        castModel = CastModel("caster1", "title test 1",1111, R.drawable.img_avatar3)
        listOfCast.add(castModel)

        castModel = CastModel("caster1", "title test 1",1111, R.drawable.img_avatar3)
        listOfCast.add(castModel)

        castModel = CastModel("caster1", "title test 1",1111, R.drawable.img_avatar3)
        listOfCast.add(castModel)

        castModel = CastModel("caster1", "title test 1",1111, R.drawable.img_avatar3)
        listOfCast.add(castModel)

        castModel = CastModel("caster1", "title test 1",1111, R.drawable.img_avatar3)
        listOfCast.add(castModel)

        castModel = CastModel("caster1", "title test 1",1111, R.drawable.img_avatar3)
        listOfCast.add(castModel)

        castModel = CastModel("caster1", "title test 1",1111, R.drawable.img_avatar3)
        listOfCast.add(castModel)

        castModel = CastModel("caster1", "title test 1",1111, R.drawable.img_avatar3)
        listOfCast.add(castModel)

        castModel = CastModel("caster1", "title test 1",1111, R.drawable.img_avatar3)
        listOfCast.add(castModel)

        castModel = CastModel("caster1", "title test 1",1111, R.drawable.img_avatar3)
        listOfCast.add(castModel)

        castModel = CastModel("caster1", "title test 1",1111, R.drawable.img_avatar3)
        listOfCast.add(castModel)

        castModel = CastModel("caster1", "title test 1",1111, R.drawable.img_avatar3)
        listOfCast.add(castModel)

        castModel = CastModel("caster1", "title test 1",1111, R.drawable.img_avatar3)
        listOfCast.add(castModel)

        castModel = CastModel("caster1", "title test 1",1111, R.drawable.img_avatar3)
        listOfCast.add(castModel)



        return listOfCast
    }

}
