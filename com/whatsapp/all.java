package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class all implements OnClickListener {
    final ContactPicker a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(0);
    }

    all(ContactPicker contactPicker) {
        this.a = contactPicker;
    }
}
