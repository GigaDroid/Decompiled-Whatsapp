package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ib implements OnClickListener {
    final Conversation a;

    ib(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(10);
        Conversation.a(this.a, this.a, this.a.aI, true);
    }
}
