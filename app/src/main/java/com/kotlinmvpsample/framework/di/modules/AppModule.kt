package com.kotlinmvpsample.framework.di.modules

import android.app.Application
import android.content.Context
import com.kotlinmvpsample.domain.abstraction.ISettingsRepository
import com.kotlinmvpsample.framework.api.ApiHelper
import com.kotlinmvpsample.framework.api.AppApiHelper
import com.kotlinmvpsample.framework.persistance.SettingsRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Author: Harsh
 * Date: 08/04/18.
 */
@Module
class AppModule {


  @Provides
  @Singleton
  internal fun provideContext(application: Application): Context = application

  @Provides
  @Singleton
  internal fun provideSettingsRepository(settingsRepository: SettingsRepository): ISettingsRepository {
    return settingsRepository;
  }

  @Provides
  @Singleton
  internal fun provideApiHelper(appApiHelper: AppApiHelper): ApiHelper = appApiHelper
}