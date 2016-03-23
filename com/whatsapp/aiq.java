package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class aiq implements OnCancelListener {
    final SmsDefaultAppWarning a;

    aiq(SmsDefaultAppWarning smsDefaultAppWarning) {
        this.a = smsDefaultAppWarning;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.a.finish();
    }
}
