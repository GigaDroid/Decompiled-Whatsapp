package com.whatsapp;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

class he implements OnScrollListener {
    final CallLogActivity a;

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        CallLogActivity.b(this.a);
    }

    he(CallLogActivity callLogActivity) {
        this.a = callLogActivity;
    }
}
