package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class _o implements OnCancelListener {
    final SmsDefaultAppWarning a;

    public void onCancel(DialogInterface dialogInterface) {
        this.a.finish();
    }

    _o(SmsDefaultAppWarning smsDefaultAppWarning) {
        this.a = smsDefaultAppWarning;
    }
}
