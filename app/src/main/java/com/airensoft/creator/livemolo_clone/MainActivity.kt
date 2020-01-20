package com.airensoft.creator.livemolo_clone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.airensoft.creator.livemolo_clone.adapter.CastListStaggeredAdapter
import com.airensoft.creator.livemolo_clone.model.CastModel
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

        castListAdapter.setCastList(CastData())
    }

    private fun CastData(): List<CastModel> {
        var listOfCast = arrayListOf<CastModel>()

        var castModel = CastModel(
            "caster1",
            "title test 1",
            1111,
            R.drawable.img_avatar3,
            "https://www.w3schools.com/w3css/img_lights.jpg"
        )
        listOfCast.add(castModel)

        castModel = CastModel(
            "caster1",
            "title test 1",
            1111,
            R.drawable.img_avatar3,
            "https://media.gettyimages.com/photos/cropped-image-of-person-eye-picture-id942369796?s=612x612"
        )
        listOfCast.add(castModel)

        castModel = CastModel(
            "caster1",
            "title test 1",
            1111,
            R.drawable.img_avatar3,
            "https://www.pythoncircle.com/media/uploads/desktop-wallpaper-change-python-20190823-d0843f2cd287490f8e1eeaa712e0f689.jpeg"
        )
        listOfCast.add(castModel)

        castModel = CastModel(
            "caster1",
            "title test 1",
            1111,
            R.drawable.img_avatar3,
            "https://cdn.vox-cdn.com/thumbor/K7b0-MAQj0C2hy707Mm8WsUIocI=/0x0:600x350/1200x800/filters:focal(252x127:348x223)/cdn.vox-cdn.com/uploads/chorus_image/image/63386642/A_Consensus_sm.0.jpg"
        )
        listOfCast.add(castModel)

        castModel = CastModel(
            "caster1",
            "title test 1",
            1111,
            R.drawable.img_avatar3,
            "https://www.designwizard.com/wp-content/uploads/2017/03/COLLL-600x1080.jpg"
        )
        listOfCast.add(castModel)

        castModel = CastModel(
            "caster1",
            "title test 1",
            1111,
            R.drawable.img_avatar3,
            "https://www.w3schools.com/w3css/img_lights.jpg"
        )
        listOfCast.add(castModel)

        castModel = CastModel(
            "caster1",
            "title test 1",
            1111,
            R.drawable.img_avatar3,
            "https://media.gettyimages.com/photos/cropped-image-of-person-eye-picture-id942369796?s=612x612"
        )
        listOfCast.add(castModel)

        castModel = CastModel(
            "caster1",
            "title test 1",
            1111,
            R.drawable.img_avatar3,
            "https://www.pythoncircle.com/media/uploads/desktop-wallpaper-change-python-20190823-d0843f2cd287490f8e1eeaa712e0f689.jpeg"
        )
        listOfCast.add(castModel)

        castModel = CastModel(
            "caster1",
            "title test 1",
            1111,
            R.drawable.img_avatar3,
            "https://cdn.vox-cdn.com/thumbor/K7b0-MAQj0C2hy707Mm8WsUIocI=/0x0:600x350/1200x800/filters:focal(252x127:348x223)/cdn.vox-cdn.com/uploads/chorus_image/image/63386642/A_Consensus_sm.0.jpg"
        )
        listOfCast.add(castModel)

        castModel = CastModel(
            "caster1",
            "title test 1",
            1111,
            R.drawable.img_avatar3,
            "https://www.designwizard.com/wp-content/uploads/2017/03/COLLL-600x1080.jpg"
        )
        listOfCast.add(castModel)

        castModel = CastModel(
            "caster1",
            "title test 1",
            1111,
            R.drawable.img_avatar3,
            "https://www.w3schools.com/w3css/img_lights.jpg"
        )
        listOfCast.add(castModel)

        castModel = CastModel(
            "caster1",
            "title test 1",
            1111,
            R.drawable.img_avatar3,
            "https://media.gettyimages.com/photos/cropped-image-of-person-eye-picture-id942369796?s=612x612"
        )
        listOfCast.add(castModel)

        castModel = CastModel(
            "caster1",
            "title test 1",
            1111,
            R.drawable.img_avatar3,
            "https://www.pythoncircle.com/media/uploads/desktop-wallpaper-change-python-20190823-d0843f2cd287490f8e1eeaa712e0f689.jpeg"
        )
        listOfCast.add(castModel)

        castModel = CastModel(
            "caster1",
            "title test 1",
            1111,
            R.drawable.img_avatar3,
            "https://cdn.vox-cdn.com/thumbor/K7b0-MAQj0C2hy707Mm8WsUIocI=/0x0:600x350/1200x800/filters:focal(252x127:348x223)/cdn.vox-cdn.com/uploads/chorus_image/image/63386642/A_Consensus_sm.0.jpg"
        )
        listOfCast.add(castModel)

        castModel = CastModel(
            "caster1",
            "title test 1",
            1111,
            R.drawable.img_avatar3,
            "https://www.designwizard.com/wp-content/uploads/2017/03/COLLL-600x1080.jpg"
        )
        listOfCast.add(castModel)

        return listOfCast
    }

}
