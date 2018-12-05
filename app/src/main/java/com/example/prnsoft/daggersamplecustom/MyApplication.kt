package com.example.prnsoft.daggersamplecustom

import android.app.Activity
import android.app.Application
import android.app.Service
import android.support.v4.app.Fragment
import com.example.prnsoft.daggersamplecustom.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.HasServiceInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class MyApplication : Application(), HasActivityInjector, HasServiceInjector, HasSupportFragmentInjector {

    @Inject
    lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

    @Inject
    lateinit var dispatchingServiceInjector: DispatchingAndroidInjector<Service>

    @Inject
    lateinit var dispatchingFragmentInjector: DispatchingAndroidInjector<Fragment>

    override fun supportFragmentInjector(): AndroidInjector<Fragment> = dispatchingFragmentInjector

    override fun serviceInjector(): AndroidInjector<Service> = dispatchingServiceInjector

    override fun activityInjector(): AndroidInjector<Activity> = dispatchingActivityInjector

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder()
            .application(this)
            .build()
            .inject(this)
    }
}