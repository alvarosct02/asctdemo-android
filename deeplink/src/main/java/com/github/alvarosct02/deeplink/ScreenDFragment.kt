package com.github.alvarosct02.deeplink

import android.os.Bundle
import android.view.View

class ScreenDFragment : BaseFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupTitle(view, title = this.javaClass.simpleName)


    }
}