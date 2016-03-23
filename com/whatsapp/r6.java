package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class r6 implements OnCancelListener {
    final ContactPicker a;

    public void onCancel(DialogInterface dialogInterface) {
        this.a.removeDialog(1);
    }

    r6(ContactPicker contactPicker) {
        this.a = contactPicker;
    }
}
