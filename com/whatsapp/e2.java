package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class e2 implements OnClickListener {
    final ChangeNumber a;

    e2(ChangeNumber changeNumber) {
        this.a = changeNumber;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ChangeNumber.a(this.a);
    }
}
