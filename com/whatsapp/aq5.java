package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class aq5 implements OnClickListener {
    final Conversation a;

    aq5(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(View view) {
        Conversation.U(this.a);
    }
}
