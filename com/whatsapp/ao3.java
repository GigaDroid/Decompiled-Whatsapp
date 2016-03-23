package com.whatsapp;

import android.view.ViewTreeObserver.OnPreDrawListener;

class ao3 implements OnPreDrawListener {
    final ConversationRowLocation a;

    ao3(ConversationRowLocation conversationRowLocation) {
        this.a = conversationRowLocation;
    }

    public boolean onPreDraw() {
        ConversationRowLocation.a(this.a).getViewTreeObserver().removeOnPreDrawListener(this);
        ConversationRowLocation.a(this.a).post(new c2(this));
        return true;
    }
}
