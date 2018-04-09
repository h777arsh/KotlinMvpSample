package com.kotlinmvpsample.ui.intro

import com.kotlinmvpsample.domain.abstraction.IBasePresenter
import com.kotlinmvpsample.domain.abstraction.IBaseView
import com.kotlinmvpsample.domain.interactor.IBaseInteractor


/**
 * Author: Harsh
 * Date: 09/04/18.
 */
interface IntroContract {
  interface View : IBaseView {
    fun setMsg()

  }

  interface Presenter : IBasePresenter {
    fun onCreate()

  }

  interface Interactor : IBaseInteractor {

  }
}