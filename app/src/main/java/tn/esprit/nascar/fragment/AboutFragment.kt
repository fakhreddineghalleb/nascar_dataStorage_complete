package tn.esprit.nascar.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import tn.esprit.nascar.R
import tn.esprit.nascar.databinding.FragmentAboutBinding

class AboutFragment: Fragment() {

    private lateinit var binding: FragmentAboutBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAboutBinding.inflate(layoutInflater)


        return binding.root
    }

}