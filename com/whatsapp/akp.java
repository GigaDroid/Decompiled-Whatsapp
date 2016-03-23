package com.whatsapp;

import android.view.ViewTreeObserver.OnPreDrawListener;

class akp implements OnPreDrawListener {
    final ConversationRow a;

    akp(ConversationRow conversationRow) {
        this.a = conversationRow;
    }

    public boolean onPreDraw() {
        ConversationRow.a(this.a).getViewTreeObserver().removeOnPreDrawListener(this);
        b2 k = this.a.k();
        if (k != null) {
            k.a(ConversationRow.a(this.a));
        }
        return true;
    }
}
