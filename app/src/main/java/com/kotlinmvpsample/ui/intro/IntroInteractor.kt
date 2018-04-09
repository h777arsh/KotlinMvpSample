package com.kotlinmvpsample.ui.intro


import com.kotlinmvpsample.domain.abstraction.ISettingsRepository
import com.kotlinmvpsample.domain.interactor.BaseInteractor
import com.kotlinmvpsample.framework.api.ApiHelper
import javax.inject.Inject

/**
 * Author: Harsh
 * Date: 09/04/18.
 */
class IntroInteractor @Inject internal constructor(preferenceHelper: ISettingsRepository,
    apiHelper: ApiHelper) : BaseInteractor(preferenceHelper, apiHelper), IntroContract.Interactor {


}