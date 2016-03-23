package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class asv implements OnClickListener {
    final ListChatInfo a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(2);
    }

    asv(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }
}
