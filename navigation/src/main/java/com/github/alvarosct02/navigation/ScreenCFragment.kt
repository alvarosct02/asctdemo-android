package com.github.alvarosct02.navigation

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController

class ScreenCFragment : BaseFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupTitle(view, title = this.javaClass.simpleName)
        setupSimpleButton(view, 6, "Go to D") {
            findNavController().navigate(R.id.action_to_screenDFragment)
        }


    }
}