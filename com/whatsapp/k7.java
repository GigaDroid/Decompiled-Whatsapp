package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class k7 implements OnClickListener {
    final ListChatInfo a;

    k7(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(4);
    }
}
