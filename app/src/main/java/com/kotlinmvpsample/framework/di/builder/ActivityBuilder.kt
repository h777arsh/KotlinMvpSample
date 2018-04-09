package com.kotlinmvpsample.framework.di.builder

import com.kotlinmvpsample.ui.intro.IntroActivity
import com.kotlinmvpsample.ui.intro.IntroModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Author: Harsh
 * Date: 09/04/18.
 */
@Module
abstract class ActivityBuilder {

  @ContributesAndroidInjector(modules = arrayOf(IntroModule::class))
  abstract fun bindIntroActivity(): IntroActivity
}