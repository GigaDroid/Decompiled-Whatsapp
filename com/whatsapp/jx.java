package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class jx implements OnClickListener {
    final ContactPicker a;

    jx(ContactPicker contactPicker) {
        this.a = contactPicker;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.setResult(-1, ContactPicker.o(this.a));
        this.a.removeDialog(3);
        this.a.finish();
    }
}
