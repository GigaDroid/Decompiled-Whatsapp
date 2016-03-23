package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class _4 implements OnClickListener {
    final Conversation a;

    _4(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(arj.Theme_ratingBarStyle);
    }
}
