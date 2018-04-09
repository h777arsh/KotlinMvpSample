package com.kotlinmvpsample.ui.intro

import dagger.Module
import dagger.Provides

/**
 * Author: Harsh
 * Date: 09/04/18.
 */
@Module
class IntroModule() {

  @Provides
  fun providePresenter(introActivity: IntroActivity, introInteractor: IntroInteractor): IntroContract.Presenter {
    return IntroPresenterImpl(introActivity, introInteractor)
  }

  @Provides
  fun provideView(introActivity: IntroActivity): IntroContract.View {
    return introActivity
  }

}