package tn.esprit.nascar.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import tn.esprit.nascar.databinding.SingleItemNewsBinding
import tn.esprit.nascar.models.News

class NewsAdapter(val newsList: MutableList<News>) : RecyclerView.Adapter<NewsAdapter.NewsHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsHolder {
        val binding = SingleItemNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NewsHolder(binding)
    }

    override fun onBindViewHolder(holder: NewsHolder, position: Int) {
        with(holder){
            with(newsList[position]){
                binding.newsTitle.text = title
                binding.newsDescription.text = description
                binding.newsImage.setImageResource(imageRes)

            }
        }
    }

    override fun getItemCount() = newsList.size

    inner class NewsHolder(val binding: SingleItemNewsBinding) : RecyclerView.ViewHolder(binding.root)
}