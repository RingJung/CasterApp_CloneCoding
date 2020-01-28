package com.airensoft.creator.livemolo_clone.fragment

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.airensoft.creator.livemolo_clone.R
import kotlinx.android.synthetic.main.fragment_home.*

class TwoFragment : Fragment(), View.OnClickListener {

    companion object {
        fun newInstance (message: String): TwoFragment {

            val f = TwoFragment()
            val bd1 = Bundle(1)

            bd1.putString(AlarmClock.EXTRA_MESSAGE, message)
            f.setArguments(bd1)

            return f
        }
    }

    fun TwoFragment(){

    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view : View? = inflater.inflate(R.layout.fragment_home, container, false);

        var textView: TextView =view!!.findViewById(R.id.text)
        textView!!.text="SECOND FRAGMENT"

        textView.setOnClickListener(this)
        return view
    }

    override fun onClick(v: View?) {
        Toast.makeText(context, "clicked", Toast.LENGTH_SHORT).show()
        Log.d("clicklisten","clicked")
    }


}