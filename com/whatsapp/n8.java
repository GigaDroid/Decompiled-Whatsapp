package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class n8 implements OnClickListener {
    final RegisterPhone a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(22);
    }

    n8(RegisterPhone registerPhone) {
        this.a = registerPhone;
    }
}
