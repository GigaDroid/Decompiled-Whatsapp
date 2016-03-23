package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class aqp implements OnClickListener {
    final Conversation a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(10);
        Conversation.a(this.a, this.a, this.a.aI, false);
    }

    aqp(Conversation conversation) {
        this.a = conversation;
    }
}
