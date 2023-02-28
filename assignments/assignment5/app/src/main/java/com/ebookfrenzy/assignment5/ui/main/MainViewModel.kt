package com.ebookfrenzy.assignment5.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel : ViewModel() {

    var newName: MutableLiveData<String> = MutableLiveData()
    //var nameList = MutableLiveData<MutableList<String>>()
    var nameList: ArrayList<String> = ArrayList()
    fun displayName() {
        newName.let {
            if(it.value != ""){

                nameList.add(it.toString())
               // nameList.value?.add(it.toString())

               // println(nameList)
            } else {
                nameList.add("No Names to display")
               // println("No Names to display")
            }
        }
    }

}