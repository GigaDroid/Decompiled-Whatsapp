package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

class ex implements OnDismissListener {
    final VerifySms a;

    ex(VerifySms verifySms) {
        this.a = verifySms;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        VerifySms.t(this.a);
    }
}
