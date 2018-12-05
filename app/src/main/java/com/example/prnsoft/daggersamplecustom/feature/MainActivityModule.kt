package com.example.prnsoft.daggersamplecustom.feature

import android.support.v4.app.FragmentManager
import com.example.prnsoft.daggersamplecustom.di.scopes.MainActivityScope
import com.example.prnsoft.daggersamplecustom.model.Warrior
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {
    @Provides
    @MainActivityScope
    fun provideWarrior(): Warrior = Warrior("Hercules", "Sword")

    @Provides
    @MainActivityScope
    fun provideActivity(mainActivity: MainActivity) : MainActivity = mainActivity

    @Provides
    @MainActivityScope
    fun provideFragmentManager(mainActivity: MainActivity) : FragmentManager = mainActivity.supportFragmentManager
}

