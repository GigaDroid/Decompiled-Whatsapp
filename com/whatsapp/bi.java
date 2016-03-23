package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class bi implements OnClickListener {
    final VerifySms a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(37);
        VerifySms.t(this.a);
    }

    bi(VerifySms verifySms) {
        this.a = verifySms;
    }
}
