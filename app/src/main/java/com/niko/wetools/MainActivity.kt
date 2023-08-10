package com.niko.wetools

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.niko.tools.Utilities

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Utilities.init(context = this)
        Utilities.toastLong("dada")
    }
}