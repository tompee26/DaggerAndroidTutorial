package com.example.prnsoft.daggersamplecustom.feature

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.prnsoft.daggersamplecustom.R
import com.example.prnsoft.daggersamplecustom.model.Warrior
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var warrior: Warrior

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("InjectionTest", warrior.name)
    }
}
