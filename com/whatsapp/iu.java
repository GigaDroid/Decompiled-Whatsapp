package com.whatsapp;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

class iu implements OnScrollListener {
    final fv a;

    public void onScrollStateChanged(AbsListView absListView, int i) {
        ChatInfoLayout.c(this.a.b);
    }

    iu(fv fvVar) {
        this.a = fvVar;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        ChatInfoLayout.c(this.a.b);
    }
}
