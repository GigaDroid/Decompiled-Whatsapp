package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ct implements OnClickListener {
    final RegisterPhone a;
    final String b;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(22);
        this.a.a(this.b);
    }

    ct(RegisterPhone registerPhone, String str) {
        this.a = registerPhone;
        this.b = str;
    }
}
