package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class jr implements OnClickListener {
    final ContactPicker a;

    jr(ContactPicker contactPicker) {
        this.a = contactPicker;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(1);
        ContactPicker.g(this.a);
    }
}
