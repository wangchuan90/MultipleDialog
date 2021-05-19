package com.wangchuan.multipledialog;

/**
 *
 * 高度填充弹窗
 * @author Changchun
 * */
abstract class FullScreenDialog : BottomDialog() {

    init {
        height = ScreenTools.getDisplayHeight()
    }

    override fun style(): Int {
        return R.style.FullscreenBottomDialog
    }
}