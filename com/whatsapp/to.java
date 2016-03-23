package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class to implements OnClickListener {
    final Conversation a;

    to(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(View view) {
        if (Conversation.g(this.a)) {
            App.aK.a(this.a.aI.p, 1, true);
            Conversation.ad(this.a);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        this.a.showDialog(11);
    }
}
