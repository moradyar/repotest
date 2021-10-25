package com.moradyar.repotest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.moradyar.rickandmortyapi.RickAndMortyApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoroutineScope(Dispatchers.IO).launch {
            val result = RickAndMortyApi().getEpisodeList()
            Log.i("XXXX", result)
        }
    }
}