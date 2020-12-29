package com.github.alvarosct02.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

open class BaseFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_base_with_buttons, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<ImageView>(R.id.bt_back).setOnClickListener {
            if (!findNavController().navigateUp()) {
                requireActivity().finish()
            }
        }

    }

    protected fun setupTitle(view: View, title: String) {
        view.findViewById<TextView>(R.id.tv_title).text = title
    }

    protected fun setupSimpleButton(view: View, index: Int, label: String, listener: () -> Unit) {
        val buttonId = when (index) {
            1 -> R.id.bt_action_1
            2 -> R.id.bt_action_2
            3 -> R.id.bt_action_3
            4 -> R.id.bt_action_4
            5 -> R.id.bt_action_5
            6 -> R.id.bt_action_6
            else -> return
        }

        view.findViewById<Button>(buttonId).isVisible = true
        view.findViewById<Button>(buttonId).text = label
        view.findViewById<Button>(buttonId).setOnClickListener {
            listener.invoke()
        }

    }
}