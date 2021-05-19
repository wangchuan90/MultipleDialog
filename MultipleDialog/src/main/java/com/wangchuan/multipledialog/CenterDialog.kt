package com.wangchuan.multipledialog;

import android.view.Gravity

/**
 *
 * 居中弹窗
 * @author Changchun
 * */
abstract class CenterDialog : BottomDialog() {

    override fun getGravity(): Int {
        return Gravity.CENTER
    }
}