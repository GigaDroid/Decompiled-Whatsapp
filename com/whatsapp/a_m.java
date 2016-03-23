package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class a_m implements OnCancelListener {
    final ContactPicker a;

    a_m(ContactPicker contactPicker) {
        this.a = contactPicker;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.a.removeDialog(2);
    }
}
