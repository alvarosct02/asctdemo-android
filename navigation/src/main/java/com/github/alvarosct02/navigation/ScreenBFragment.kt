package com.github.alvarosct02.navigation

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController

class ScreenBFragment : BaseFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupTitle(view, title = this.javaClass.simpleName)
        setupSimpleButton(view, 1, "Go to C") {
            findNavController().navigate(R.id.action_screenBFragment_to_screenCFragment)
        }
        setupSimpleButton(view, 6, "Go to D") {
            findNavController().navigate(R.id.action_to_screenDFragment)
        }


    }
}