package com.niko.tools

import android.content.Context
import android.widget.Toast

object Utilities {

    private lateinit var mAppContext : Context

    fun init(context: Context) {
        mAppContext = context
    }

    fun toastShort(s: String) {
        Toast.makeText(mAppContext, s, Toast.LENGTH_SHORT).show()
    }

    fun toastLong(s: String) {
        Toast.makeText(mAppContext, s, Toast.LENGTH_SHORT).show()
    }


}