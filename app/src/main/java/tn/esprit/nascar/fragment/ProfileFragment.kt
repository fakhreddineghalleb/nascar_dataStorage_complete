package tn.esprit.nascar.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import tn.esprit.nascar.adapters.BookmarksAdapter
import tn.esprit.nascar.databinding.FragmentProfileBinding
import tn.esprit.nascar.utils.AppDatabase

class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentProfileBinding.inflate(layoutInflater)

        binding.rvBookmarks.adapter = BookmarksAdapter(AppDatabase.getInstance(requireContext()).eventDao().getAllEvent())

        binding.rvBookmarks.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        return binding.root
    }

}