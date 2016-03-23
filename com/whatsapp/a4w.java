package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class a4w implements OnClickListener {
    final Conversation a;

    public void onClick(View view) {
        this.a.onOptionsItemSelected(Conversation.ae(this.a));
    }

    a4w(Conversation conversation) {
        this.a = conversation;
    }
}
