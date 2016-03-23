package com.whatsapp;

import android.widget.PopupWindow.OnDismissListener;

class am8 implements OnDismissListener {
    final Conversation a;

    public void onDismiss() {
        if (Conversation.J(this.a).c()) {
            Conversation.n(this.a).postDelayed(Conversation.h(this.a), 1000);
            Conversation.ah(this.a);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        Conversation.n(this.a).setUnfreezeHeight();
        Conversation.n(this.a).requestLayout();
    }

    am8(Conversation conversation) {
        this.a = conversation;
    }
}
