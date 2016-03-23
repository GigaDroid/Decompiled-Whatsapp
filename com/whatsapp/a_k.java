package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class a_k implements OnClickListener {
    final SmsDefaultAppWarning a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(0);
        SmsDefaultAppWarning.b(this.a);
        this.a.finish();
    }

    a_k(SmsDefaultAppWarning smsDefaultAppWarning) {
        this.a = smsDefaultAppWarning;
    }
}
