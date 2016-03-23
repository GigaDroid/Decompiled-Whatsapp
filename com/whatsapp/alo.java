package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class alo implements OnClickListener {
    final VerifySms a;

    alo(VerifySms verifySms) {
        this.a = verifySms;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(43);
        VerifySms.t(this.a);
    }
}
