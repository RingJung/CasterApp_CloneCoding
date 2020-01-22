package com.airensoft.creator.livemolo_clone.fragment

import android.os.Bundle
import android.provider.AlarmClock
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.airensoft.creator.livemolo_clone.R

class ThreeFragment : Fragment(){

    companion object {
        fun newInstance (message: String): ThreeFragment {

            val f = ThreeFragment()
            val bd1 = Bundle(1)

            bd1.putString(AlarmClock.EXTRA_MESSAGE, message)
            f.setArguments(bd1)

            return f
        }
    }

    fun OneFragment(){

    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view : View? = inflater.inflate(R.layout.fragment_home, container, false);

        var textView: TextView =view!!.findViewById(R.id.text)
        textView!!.text="THIRD FRAGMENT"

        return view
    }


}