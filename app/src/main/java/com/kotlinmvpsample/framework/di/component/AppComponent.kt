package com.kotlinmvpsample.framework.di.component

import android.app.Application
import com.kotlinmvpsample.App
import com.kotlinmvpsample.framework.di.builder.ActivityBuilder
import com.kotlinmvpsample.framework.di.modules.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * Author: Harsh
 * Date: 08/04/18.
 */

@Singleton
@Component(modules = [AndroidInjectionModule::class, AppModule::class, ActivityBuilder::class])
interface AppComponent {

  @Component.Builder
  interface Builder {

    @BindsInstance
    fun application(application: Application): Builder

    fun build(): AppComponent
  }

  fun inject(app: App)
}