package com.whatsapp;

import android.view.View;
import android.view.View.OnLongClickListener;

class gu implements OnLongClickListener {
    final Conversation a;

    public boolean onLongClick(View view) {
        Conversation.U(this.a);
        return true;
    }

    gu(Conversation conversation) {
        this.a = conversation;
    }
}
