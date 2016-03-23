package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.util.bq;

class iw implements OnClickListener {
    final VerifyNumber a;

    iw(VerifyNumber verifyNumber) {
        this.a = verifyNumber;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(arj.Theme_switchStyle);
        bq.a(new m5(this.a, this.a, true, true, ""), new String[0]);
    }
}
