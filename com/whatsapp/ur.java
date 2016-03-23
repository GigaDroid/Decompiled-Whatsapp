package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ur implements OnClickListener {
    final VerifySms a;

    ur(VerifySms verifySms) {
        this.a = verifySms;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(34);
        VerifySms.t(this.a);
    }
}
