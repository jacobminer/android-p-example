package com.melonhead.myapplication.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.melonhead.myapplication.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        viewModel.text = MainFragmentArgs.fromBundle(arguments).string
        message.text = viewModel.text
        when (viewModel.text) {
            "\"1\"" -> button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.mainFragment2))
            "\"2\"" -> button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.mainFragment3))
            "\"3\"" -> button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.deepLinkFragment))
        }
    }

}
