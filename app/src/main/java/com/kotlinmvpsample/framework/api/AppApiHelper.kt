package com.kotlinmvpsample.framework.api

import com.kotlinmvpsample.domain.abstraction.ISettingsRepository
import javax.inject.Inject

class AppApiHelper @Inject constructor(private val settingsRepository: ISettingsRepository) : ApiHelper {


}