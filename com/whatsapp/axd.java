package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class axd implements OnClickListener {
    final VerifySms a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(7);
        VerifySms.t(this.a);
    }

    axd(VerifySms verifySms) {
        this.a = verifySms;
    }
}
