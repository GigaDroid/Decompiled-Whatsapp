package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class a26 implements OnClickListener {
    final Conversation a;

    a26(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(View view) {
        Conversation.k(this.a).dismiss();
        Conversation.aB(this.a);
    }
}
