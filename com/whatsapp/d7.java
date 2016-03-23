package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class d7 implements OnClickListener {
    final SmsDefaultAppWarning a;

    d7(SmsDefaultAppWarning smsDefaultAppWarning) {
        this.a = smsDefaultAppWarning;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(1);
        SmsDefaultAppWarning.b(this.a);
        this.a.finish();
    }
}
