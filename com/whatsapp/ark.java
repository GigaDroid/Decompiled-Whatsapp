package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class ark implements OnClickListener {
    final Conversation a;

    public void onClick(View view) {
        Conversation.k(this.a).dismiss();
        Conversation.S(this.a);
    }

    ark(Conversation conversation) {
        this.a = conversation;
    }
}
