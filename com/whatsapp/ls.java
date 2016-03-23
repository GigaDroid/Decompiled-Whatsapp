package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ls implements OnClickListener {
    final EnterPhoneNumber a;
    final String b;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(22);
        this.a.a(this.b);
    }

    ls(EnterPhoneNumber enterPhoneNumber, String str) {
        this.a = enterPhoneNumber;
        this.b = str;
    }
}
