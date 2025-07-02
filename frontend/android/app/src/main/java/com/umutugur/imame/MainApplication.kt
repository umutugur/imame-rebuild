package com.umutugur.imame

import android.app.Application
import com.facebook.react.PackageList
import com.facebook.react.ReactApplication
import com.facebook.react.ReactNativeHost
import com.facebook.react.ReactPackage
import com.facebook.soloader.SoLoader
import expo.modules.ApplicationLifecycleDispatcher
import expo.modules.ReactNativeHostWrapper

class MainApplication : Application(), ReactApplication {

  override val reactNativeHost: ReactNativeHost by lazy {
    ReactNativeHostWrapper(
      this,
      object : ReactNativeHost(this) {
        override fun getUseDeveloperSupport() = BuildConfig.DEBUG

        override fun getPackages(): List<ReactPackage> {
          return PackageList(this).packages
        }

        override fun getJSMainModuleName() = "index"
      }
    )
  }

  override fun onCreate() {
    super.onCreate()
    SoLoader.init(this, false)
    ApplicationLifecycleDispatcher.onApplicationCreate(this)
  }
}
