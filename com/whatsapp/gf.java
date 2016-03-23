package com.whatsapp;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;

class gf implements OnPreDrawListener {
    final Conversation a;
    final View b;

    public boolean onPreDraw() {
        Conversation.ab(this.a).d();
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }

    gf(Conversation conversation, View view) {
        this.a = conversation;
        this.b = view;
    }
}
