package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class au8 implements OnClickListener {
    final EnterPhoneNumber a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(22);
    }

    au8(EnterPhoneNumber enterPhoneNumber) {
        this.a = enterPhoneNumber;
    }
}
