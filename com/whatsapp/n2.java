package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class n2 implements OnClickListener {
    final ContactPicker a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(1);
    }

    n2(ContactPicker contactPicker) {
        this.a = contactPicker;
    }
}
