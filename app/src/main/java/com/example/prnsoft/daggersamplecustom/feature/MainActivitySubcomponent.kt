package com.example.prnsoft.daggersamplecustom.feature

import com.example.prnsoft.daggersamplecustom.di.scopes.MainActivityScope
import dagger.Subcomponent
import dagger.android.AndroidInjector

@MainActivityScope
@Subcomponent(modules = [MainActivityModule::class])
interface MainActivitySubcomponent : AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()
}