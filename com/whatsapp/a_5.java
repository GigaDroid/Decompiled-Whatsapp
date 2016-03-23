package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class a_5 implements OnClickListener {
    final ContactPicker a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.setResult(-1, ContactPicker.o(this.a));
        this.a.removeDialog(2);
        this.a.finish();
    }

    a_5(ContactPicker contactPicker) {
        this.a = contactPicker;
    }
}
