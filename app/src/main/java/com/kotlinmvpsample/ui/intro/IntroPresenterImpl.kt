package com.kotlinmvpsample.ui.intro

import com.github.ajalt.timberkt.d

/**
 * Author: Harsh
 * Date: 09/04/18.
 */
class IntroPresenterImpl(val view: IntroContract.View, val interactor: IntroContract.Interactor) : IntroContract.Presenter {
  override fun onCreate() {
    d { "here onCreate so dependencyInjection is working" }
    view.setMsg()
  }


}