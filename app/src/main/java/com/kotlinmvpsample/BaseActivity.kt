package com.kotlinmvpsample

import android.app.ProgressDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.kotlinmvpsample.utils.CommonUtil
import dagger.android.AndroidInjection

/**
 * Author: Harsh
 * Date: 09/04/18.
 */
abstract class BaseActivity : AppCompatActivity() {
  private var progressDialog: ProgressDialog? = null
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    injectView()
  }

  private fun injectView() {
    AndroidInjection.inject(this)
  }

  protected fun hideProgress() {
    progressDialog?.let { if (it.isShowing) it.cancel() }
  }

  protected fun showProgress() {
    hideProgress()
    progressDialog = CommonUtil.showLoadingDialog(this)
  }


}