package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class aii implements OnClickListener {
    final Conversation a;

    public void onClick(View view) {
        if (Conversation.L(this.a)) {
            Conversation.J(this.a).a(true);
            Conversation.O(this.a);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        Conversation.C(this.a);
    }

    aii(Conversation conversation) {
        this.a = conversation;
    }
}
