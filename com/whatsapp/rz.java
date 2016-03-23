package com.whatsapp;

import android.view.View;
import android.view.View.OnLongClickListener;

class rz implements OnLongClickListener {
    final Conversation a;

    public boolean onLongClick(View view) {
        Conversation.k(this.a).dismiss();
        Conversation.y(this.a);
        return true;
    }

    rz(Conversation conversation) {
        this.a = conversation;
    }
}
