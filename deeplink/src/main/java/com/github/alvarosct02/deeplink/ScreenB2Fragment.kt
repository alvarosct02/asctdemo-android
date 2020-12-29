package com.github.alvarosct02.deeplink

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.github.alvarosct02.navigation.R

class ScreenB2Fragment : BaseFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupTitle(view, title = this.javaClass.simpleName)
        setupSimpleButton(view, 1, "Go to C") {
            findNavController().navigate(R.id.action_screenB2Fragment_to_screenCFragment)
        }
        setupSimpleButton(view, 2, "Go to B2C") {
            findNavController().navigate(R.id.action_screenB2Fragment_to_screenB2CFragment)
        }
        setupSimpleButton(view, 6, "Go to D") {
            findNavController().navigate(R.id.action_to_screenDFragment)
        }


    }
}