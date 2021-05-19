package com.wangchuan.multipledialog

import android.os.Bundle

class HintDialog : BottomDialog() {


    init {
        layoutRes = R.layout.dialog_hint
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        需要处理界面的地方
    }
}