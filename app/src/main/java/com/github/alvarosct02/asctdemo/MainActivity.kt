package com.github.alvarosct02.asctdemo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.github.alvarosct02.deeplink.DeepLinkActivity
import com.github.alvarosct02.navigation.NavigationActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.bt_deeplink).setOnClickListener {
            startActivity(Intent(this@MainActivity, DeepLinkActivity::class.java))
        }

        findViewById<Button>(R.id.bt_navigation).setOnClickListener {
            startActivity(Intent(this@MainActivity, NavigationActivity::class.java))
        }

    }
}