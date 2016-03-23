package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class a5t implements OnClickListener {
    final Conversation a;

    public void onClick(View view) {
        if (Voip.d()) {
            App.a(this.a, 2131231127, 0);
            return;
        }
        Conversation.k(this.a).dismiss();
        Conversation.F(this.a);
    }

    a5t(Conversation conversation) {
        this.a = conversation;
    }
}
