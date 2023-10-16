package tn.esprit.nascar.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import tn.esprit.nascar.R
import tn.esprit.nascar.adapters.EventsAdapter
import tn.esprit.nascar.databinding.FragmentEventsBinding
import tn.esprit.nascar.models.Events


class EventsFragment : Fragment() {
    private lateinit var binding: FragmentEventsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentEventsBinding.inflate(layoutInflater)

        binding.rvEvents.adapter = EventsAdapter(getListEvents(requireContext()))
        binding.rvEvents.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        return binding.root
    }

    private fun getListEvents(context: Context) : MutableList<Events> {
        return mutableListOf(
            Events(1, R.drawable.ic_event1, context.getString(R.string.event1) , context.getString(R.string.eventDate1)),
            Events(2, R.drawable.ic_event2, context.getString(R.string.event2) , context.getString(R.string.eventDate2)),
            Events(3, R.drawable.ic_event3, context.getString(R.string.event3) , context.getString(R.string.eventDate3)),
            Events(4, R.drawable.ic_event4, context.getString(R.string.event4) , context.getString(R.string.eventDate4)),
            Events(5, R.drawable.ic_event1, context.getString(R.string.event1) , context.getString(R.string.eventDate1)),
            Events(6, R.drawable.ic_event2, context.getString(R.string.event2) , context.getString(R.string.eventDate2)),
            Events(7, R.drawable.ic_event3, context.getString(R.string.event3) , context.getString(R.string.eventDate3)),
            Events(8, R.drawable.ic_event4, context.getString(R.string.event4) , context.getString(R.string.eventDate4))
        )
    }

}