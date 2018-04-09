package com.kotlinmvpsample.ui.intro

import android.os.Bundle
import com.github.ajalt.timberkt.d
import com.kotlinmvpsample.BaseActivity
import com.kotlinmvpsample.R
import com.kotlinmvpsample.ui.intro.IntroContract.Presenter
import com.kotlinmvpsample.ui.intro.IntroContract.View
import javax.inject.Inject

/**
 * Author: Harsh
 * Date: 09/04/18.
 */
class IntroActivity : BaseActivity(), View {

  @Inject
  internal lateinit var presenter: Presenter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_intro)
    presenter.onCreate()

  }

  override fun setMsg() {
    d { "here we are going to see msg is printed or not" }
  }
}