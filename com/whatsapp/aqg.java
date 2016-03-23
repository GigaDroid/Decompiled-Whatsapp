package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class aqg implements OnClickListener {
    final RegisterPhone a;

    aqg(RegisterPhone registerPhone) {
        this.a = registerPhone;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        EnterPhoneNumber.C = 0;
        this.a.removeDialog(21);
    }
}
