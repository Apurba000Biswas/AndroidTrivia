package com.apurba.androidtrivia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class FragmentGameWon : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val rootView : View = inflater.inflate(R.layout.fragment_game_won, container, false)
        rootView.findViewById<Button>(R.id.button5).setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_fragmentGameWon_to_gameFragment)
        )

        return rootView
    }

}