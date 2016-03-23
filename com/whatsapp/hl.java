package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class hl implements OnClickListener {
    final Conversation a;

    hl(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(11);
        Conversation.b(this.a, this.a.aI.s());
        Conversation.l(this.a, false);
    }
}
