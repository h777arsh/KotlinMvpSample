package com.kotlinmvpsample.domain.interactor

/**
 * Author: Harsh
 * Date: 08/04/18.
 */
interface IBaseInteractor {
  fun isUserLoggedIn(): Boolean

  fun performUserLogout()
}