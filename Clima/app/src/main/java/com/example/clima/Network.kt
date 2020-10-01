package com.example.clima

import android.content.Context
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity

class Network {

    companion object{
        fun conectadoAIntenet(activity:AppCompatActivity):Boolean{
            val conectivityManager = activity.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val networkInfo = conectivityManager.activeNetworkInfo
            return networkInfo != null && networkInfo.isConnected
        }
    }
}