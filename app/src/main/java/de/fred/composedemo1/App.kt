package de.fred.composedemo1

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import de.fred.composedemo1.di.uiModule
import de.fred.composedemo1.navigation.di.navigationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import de.fred.composedemo1.secondfeature.di.uiModule as secondFeatureUiModule
import de.fred.composedemo1.thirdfeature.di.uiModule as thirdFeatureUiModule

@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(
                navigationModule,
                uiModule,
                secondFeatureUiModule,
                thirdFeatureUiModule
            )
        }
    }
}