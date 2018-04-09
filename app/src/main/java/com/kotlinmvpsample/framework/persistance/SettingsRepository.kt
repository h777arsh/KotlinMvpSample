package com.kotlinmvpsample.framework.persistance

import android.content.Context
import android.content.SharedPreferences
import com.kotlinmvpsample.domain.abstraction.ISettingsRepository
import javax.inject.Inject

/**
 * Author: Harsh
 * Date: 08/04/18.
 */
class SettingsRepository @Inject constructor(context: Context) : ISettingsRepository {

  companion object {
    private val PREF_NAME = "PREF_APP"
  }

  private val mPrefs: SharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)


}