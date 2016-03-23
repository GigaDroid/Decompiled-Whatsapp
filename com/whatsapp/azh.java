package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class azh implements OnCancelListener {
    final ContactPicker a;

    public void onCancel(DialogInterface dialogInterface) {
        this.a.removeDialog(3);
    }

    azh(ContactPicker contactPicker) {
        this.a = contactPicker;
    }
}
