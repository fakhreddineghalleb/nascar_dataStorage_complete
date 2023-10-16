package tn.esprit.nascar.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import tn.esprit.nascar.R
import tn.esprit.nascar.adapters.NewsAdapter
import tn.esprit.nascar.databinding.FragmentNewsBinding
import tn.esprit.nascar.models.News

class NewsFragment : Fragment() {

    private lateinit var binding: FragmentNewsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentNewsBinding.inflate(layoutInflater)

        binding.rvNews.adapter = NewsAdapter(getListNews(requireContext()))
        binding.rvNews.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        return binding.root
    }

    private fun getListNews(context: Context) : MutableList<News> {
        return mutableListOf(
            News(1, R.drawable.ic_news1, context.getString(R.string.news1) , context.getString(R.string.newsDesc1)),
            News(2, R.drawable.ic_news2, context.getString(R.string.news2) , context.getString(R.string.newsDesc2)),
            News(3, R.drawable.ic_news3, context.getString(R.string.news3) , context.getString(R.string.newsDesc3))
        )
    }

}