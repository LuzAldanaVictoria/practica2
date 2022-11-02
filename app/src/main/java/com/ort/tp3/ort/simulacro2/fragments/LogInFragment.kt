package com.ort.tp3.ort.simulacro2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.ort.tp3.ort.simulacro2.R

class LogInFragment : Fragment() {
    var v: View? = null
    lateinit var btnLogIn: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_log_in, container, false)


        btnLogIn = v!!.findViewById(R.id.btnLogIn)

        return v
    }

    override fun onStart() {
        super.onStart()
        btnLogIn.setOnClickListener {
            val action = LogInFragmentDirections.actionLogInFragmentToHomeFragment()
            v?.findNavController()?.navigate(action)
        }

        }


}