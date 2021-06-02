package com.apurba.androidtrivia

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.apurba.androidtrivia.databinding.FragmentTittleBinding


class FragmentTittle : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding : FragmentTittleBinding = DataBindingUtil.inflate(inflater
            , R.layout.fragment_tittle, container, false);
        setHasOptionsMenu(true)
        binding.button.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_fragmentTittle_to_gameFragment)
        )

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.overflow_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, view!!.findNavController()) || super.onOptionsItemSelected(item)
    }
}