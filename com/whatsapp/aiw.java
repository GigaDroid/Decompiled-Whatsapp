package com.whatsapp;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class aiw implements OnGlobalLayoutListener {
    final CallLogActivity a;

    aiw(CallLogActivity callLogActivity) {
        this.a = callLogActivity;
    }

    public void onGlobalLayout() {
        CallLogActivity.b(this.a);
    }
}
