package tn.esprit.nascar.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import tn.esprit.nascar.databinding.SingleItemEventsBinding
import tn.esprit.nascar.models.Events
import tn.esprit.nascar.utils.AppDatabase

class EventsAdapter(val eventsList: MutableList<Events>) : RecyclerView.Adapter<EventsAdapter.EventsHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventsHolder {
        val binding = SingleItemEventsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EventsHolder(binding)
    }

    override fun onBindViewHolder(holder: EventsHolder, position: Int) {
        with(holder){
            with(eventsList[position]){
                binding.eventTitle.text = title
                binding.eventDescription.text = description
                binding.eventImage.setImageResource(imageRes)
                binding.btnAddBookmark.setOnClickListener {
                    if (AppDatabase.getInstance(holder.itemView.context).eventDao().getFindEventById(this.id) == null)
                        AppDatabase.getInstance(holder.itemView.context).eventDao().insertEvent(this)
                    else
                        Snackbar.make(holder.itemView, "This event is already in bookmark !", Snackbar.LENGTH_SHORT).show()
                }
            }
        }
    }

    override fun getItemCount() = eventsList.size

    inner class EventsHolder(val binding: SingleItemEventsBinding) : RecyclerView.ViewHolder(binding.root)
}