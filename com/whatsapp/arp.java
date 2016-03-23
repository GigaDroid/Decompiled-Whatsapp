package com.whatsapp;

import android.view.ViewTreeObserver.OnPreDrawListener;

class arp implements OnPreDrawListener {
    final ConversationRow a;
    final a4l b;

    arp(a4l com_whatsapp_a4l, ConversationRow conversationRow) {
        this.b = com_whatsapp_a4l;
        this.a = conversationRow;
    }

    public boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.a.d();
        return true;
    }
}
