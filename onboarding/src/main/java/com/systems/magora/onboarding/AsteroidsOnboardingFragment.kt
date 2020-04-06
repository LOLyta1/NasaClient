package com.systems.magora.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


import androidx.navigation.NavDestination

import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import com.systems.magora.nasaclient.MainNavDirections


import kotlinx.android.synthetic.main.fragment_asteroids_neo_ws.view.*


class AsteroidsOnboardingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_asteroids_neo_ws, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.neows_next_button.setOnClickListener {

    findNavController(activity!!,R.id.main_nav_host)
            .navigate(MainNavDirections.actionGlobalApodNavHovFragment())
        }
    }
}
