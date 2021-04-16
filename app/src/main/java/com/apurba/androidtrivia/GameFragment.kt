package com.apurba.androidtrivia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class GameFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val rootView : View = inflater.inflate(R.layout.fragment_game, container, false)

        rootView.findViewById<Button>(R.id.button2).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_gameFragment_to_fragmentGameWon))
        rootView.findViewById<Button>(R.id.button3).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_gameFragment_to_fragmentGameOver))

        // Inflate the layout for this fragment
        return rootView
    }

}