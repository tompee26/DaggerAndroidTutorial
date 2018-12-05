package com.example.prnsoft.daggersamplecustom.di

import com.example.prnsoft.daggersamplecustom.feature.MainActivity
import com.example.prnsoft.daggersamplecustom.feature.MainActivitySubcomponent
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module(subcomponents = [MainActivitySubcomponent::class])
abstract class ActivityModule {
    @Binds
    @IntoMap
    @ClassKey(MainActivity::class)
    abstract fun bindMainActivityInjectorFactory(builder: MainActivitySubcomponent.Builder): AndroidInjector.Factory<*>
}