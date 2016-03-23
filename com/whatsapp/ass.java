package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ass implements OnClickListener {
    final Conversation a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(9);
        Conversation.e(this.a, qa.d(this.a.ae).s());
    }

    ass(Conversation conversation) {
        this.a = conversation;
    }
}
