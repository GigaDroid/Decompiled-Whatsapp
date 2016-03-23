package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class ek implements OnClickListener {
    final Conversation a;

    public void onClick(View view) {
        Conversation.G(this.a);
    }

    ek(Conversation conversation) {
        this.a = conversation;
    }
}
