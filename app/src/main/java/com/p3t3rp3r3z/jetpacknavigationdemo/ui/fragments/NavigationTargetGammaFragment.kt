package com.p3t3rp3r3z.jetpacknavigationdemo.ui.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.p3t3rp3r3z.jetpacknavigationdemo.R
import com.p3t3rp3r3z.jetpacknavigationdemo.ui.viewmodels.NavigationTargetGammaViewModel

class NavigationTargetGammaFragment : Fragment() {

    companion object {
        fun newInstance() = NavigationTargetGammaFragment()
    }

    private lateinit var viewModel: NavigationTargetGammaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.navigation_target_gamma_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(NavigationTargetGammaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}