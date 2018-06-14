package com.safframework.delegate.prefs

import android.content.SharedPreferences

/**
 *
 * @FileName:
 *          com.safframework.delegate.prefs.PrefsHelper.java
 * @author: Tony Shen
 * @date: 2018-06-13 23:44
 * @version V1.0 <描述当前版本功能>
 */
class PrefsHelper(prefs: SharedPreferences) {

    var token by prefs.string()
        private set

    var count by prefs.int()
        private set

    fun saveToken(newToken: String) {
        token = newToken
        count++
    }
}