package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class eq implements OnClickListener {
    final SmsDefaultAppWarning a;

    eq(SmsDefaultAppWarning smsDefaultAppWarning) {
        this.a = smsDefaultAppWarning;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(1);
        SmsDefaultAppWarning.a(this.a);
        this.a.finish();
    }
}
