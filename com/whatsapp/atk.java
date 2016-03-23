package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class atk implements OnClickListener {
    final Conversation a;

    public void onClick(DialogInterface dialogInterface, int i) {
        Conversation.N(this.a);
        this.a.removeDialog(arj.Theme_ratingBarStyle);
    }

    atk(Conversation conversation) {
        this.a = conversation;
    }
}
