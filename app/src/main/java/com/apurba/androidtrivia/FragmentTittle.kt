package com.apurba.androidtrivia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.apurba.androidtrivia.databinding.FragmentTittleBinding


class FragmentTittle : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding : FragmentTittleBinding = DataBindingUtil.inflate(inflater
            , R.layout.fragment_tittle, container, false);

        binding.button.setOnClickListener { view : View ->
            Navigation.findNavController(view).navigate(R.id.action_fragmentTittle_to_gameFragment)
        }

        return binding.root
    }

}