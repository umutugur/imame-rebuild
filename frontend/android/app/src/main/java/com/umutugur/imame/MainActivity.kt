package com.umutugur.imame

import com.facebook.react.ReactActivity
import expo.modules.ReactActivityDelegateWrapper

class MainActivity : ReactActivity() {
  override fun getMainComponentName(): String = "main"

  override fun createReactActivityDelegate() =
    ReactActivityDelegateWrapper(
      this,
      BuildConfig.DEBUG,
      super.createReactActivityDelegate()
    )
}
