package com.ebookfrenzy.assignment7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.net.Uri

class MainActivity : AppCompatActivity(), SecondFragment.OnFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onFragmentInteraction(uri: Uri) {
    }
}