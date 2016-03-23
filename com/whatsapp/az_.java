package com.whatsapp;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

class az_ implements OnScrollListener {
    final ListChatInfo a;

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    az_(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        ListChatInfo.j(this.a);
    }
}
