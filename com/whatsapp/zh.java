package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class zh implements OnClickListener {
    final VerifySms a;

    zh(VerifySms verifySms) {
        this.a = verifySms;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(21);
        VerifySms.t(this.a);
    }
}
