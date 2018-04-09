package com.kotlinmvpsample

import android.app.Activity
import android.app.Application
import com.androidnetworking.AndroidNetworking
import com.facebook.stetho.okhttp3.StethoInterceptor
import com.kotlinmvpsample.framework.di.component.DaggerAppComponent

import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import okhttp3.OkHttpClient
import timber.log.Timber
import javax.inject.Inject



/**
 * Author: Harsh
 * Date: 08/04/18.
 */
class App : Application(), HasActivityInjector {

  @Inject
  internal lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

  override fun activityInjector() = activityDispatchingAndroidInjector

  override fun onCreate() {
    super.onCreate()
    Timber.plant(Timber.DebugTree())
    // Adding an Network Interceptor for Debugging purpose :
    val okHttpClient = OkHttpClient().newBuilder()
        .addNetworkInterceptor(StethoInterceptor())
        .build()
    AndroidNetworking.initialize(this, okHttpClient)
    DaggerAppComponent.builder().application(this).build().inject(this)
  }
}