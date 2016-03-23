package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class kf implements OnCancelListener {
    final ContactPicker a;

    public void onCancel(DialogInterface dialogInterface) {
        this.a.removeDialog(0);
    }

    kf(ContactPicker contactPicker) {
        this.a = contactPicker;
    }
}
