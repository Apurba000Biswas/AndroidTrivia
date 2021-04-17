package com.apurba.androidtrivia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class FragmentGameOver : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val rootView: View = inflater.inflate(R.layout.fragment_game_over, container, false)

        rootView.findViewById<Button>(R.id.button4).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_fragmentGameOver_to_gameFragment))

        return rootView
    }


}