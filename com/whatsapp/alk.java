package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class alk implements OnClickListener {
    final VerifySms a;

    alk(VerifySms verifySms) {
        this.a = verifySms;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(4);
        VerifySms.t(this.a);
    }
}
