package com.wangchuan.multipledialog

import android.app.Application
import android.content.res.Resources
import android.support.v4.app.FragmentActivity
import android.util.Log

object AppInfoTools {

    var topActivity: FragmentActivity? = null

    /**
     * 获取当前应用的Application
     * 先使用ActivityThread里获取Application的方法，如果没有获取到，
     * 再使用AppGlobals里面的获取Application的方法
     * @return
     */
    val curApplication: Application?
        get() {
            var application: Application? = null
            try {
                val atClass = Class.forName("android.app.ActivityThread")
                val currentApplicationMethod = atClass.getDeclaredMethod("currentApplication")
                currentApplicationMethod.isAccessible = true
                application = currentApplicationMethod.invoke(null) as Application
                Log.d("fw_create", "curApp class1:$application")
            } catch (e: Exception) {
                Log.d("fw_create", "e:$e")
            }
            if (application != null) return application
            try {
                val atClass = Class.forName("android.app.AppGlobals")
                val currentApplicationMethod = atClass.getDeclaredMethod("getInitialApplication")
                currentApplicationMethod.isAccessible = true
                application = currentApplicationMethod.invoke(null) as Application
                Log.d("fw_create", "curApp class2:$application")
            } catch (e: Exception) {
                Log.d("fw_create", "e:$e")
            }
            return application
        }
    val resources: Resources
        get() = Resources.getSystem()
}