package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class ua implements OnClickListener {
    final Conversation a;

    public void onClick(View view) {
        if (!aup.a(this.a.aI.p)) {
            this.a.showDialog(1);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        Conversation.N(this.a);
    }

    ua(Conversation conversation) {
        this.a = conversation;
    }
}
