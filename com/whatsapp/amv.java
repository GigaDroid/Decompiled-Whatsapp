package com.whatsapp;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;

class amv implements OnPreDrawListener {
    final View a;
    final ListChatInfo b;

    amv(ListChatInfo listChatInfo, View view) {
        this.b = listChatInfo;
        this.a = view;
    }

    public boolean onPreDraw() {
        ListChatInfo.b(this.b).d();
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
