package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ad_ implements OnClickListener {
    final Conversation a;

    ad_(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(11);
        Conversation.a(this.a, this.a.aI.a(this.a));
        Conversation.l(this.a, false);
    }
}
