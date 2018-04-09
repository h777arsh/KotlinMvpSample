package com.kotlinmvpsample.domain.interactor

import com.kotlinmvpsample.domain.abstraction.ISettingsRepository
import com.kotlinmvpsample.framework.api.ApiHelper

/**
 * Author: Harsh
 * Date: 08/04/18.
 */
open class BaseInteractor() : IBaseInteractor {


  protected lateinit var preferenceHelper: ISettingsRepository
  protected lateinit var apiHelper: ApiHelper

  constructor(preferenceHelper: ISettingsRepository, apiHelper: ApiHelper) : this() {
    this.preferenceHelper = preferenceHelper
    this.apiHelper = apiHelper
  }


  override fun performUserLogout() {

  }

  override fun isUserLoggedIn() = false

}