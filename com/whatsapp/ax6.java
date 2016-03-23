package com.whatsapp;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

class ax6 implements OnScrollListener {
    final ChatInfoLayout a;

    public void onScrollStateChanged(AbsListView absListView, int i) {
        ChatInfoLayout.c(this.a);
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        ChatInfoLayout.c(this.a);
    }

    ax6(ChatInfoLayout chatInfoLayout) {
        this.a = chatInfoLayout;
    }
}
