package com.airensoft.creator.livemolo_clone.fragment

import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.airensoft.creator.livemolo_clone.GridItemDecoration
import com.airensoft.creator.livemolo_clone.R
import com.airensoft.creator.livemolo_clone.adapter.CastListAdapter
import com.airensoft.creator.livemolo_clone.model.CastModel
import kotlinx.android.synthetic.main.fragment_main.*

class Main_fragment : Fragment(), View.OnClickListener{
    companion object {
        fun newInstance (message: String): Main_fragment {

            val f = Main_fragment()
            val bd1 = Bundle(1)

            bd1.putString(EXTRA_MESSAGE, message)
            f.setArguments(bd1)

            return f
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_main,container,false)
        return view

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initView()
        recyclerview?.setOnClickListener(this)
    }
    private val adapter = CastListAdapter()
    private fun initView(){
        recyclerview.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        //This will for default android divider
        recyclerview.addItemDecoration(GridItemDecoration(10, 2))
        recyclerview.adapter = adapter
        adapter.setCastList(CastData())
    }

     override fun onClick(v: View?) {
        Toast.makeText(context, "clicked", Toast.LENGTH_SHORT).show()
        Log.d("clicklisten","clicked")
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