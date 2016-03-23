package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class qq implements OnClickListener {
    final EnterPhoneNumber a;

    qq(EnterPhoneNumber enterPhoneNumber) {
        this.a = enterPhoneNumber;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(23);
    }
}
