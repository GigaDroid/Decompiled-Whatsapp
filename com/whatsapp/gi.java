package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class gi implements OnClickListener {
    final SmsDefaultAppWarning a;

    gi(SmsDefaultAppWarning smsDefaultAppWarning) {
        this.a = smsDefaultAppWarning;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(0);
        SmsDefaultAppWarning.a(this.a);
        this.a.finish();
    }
}
