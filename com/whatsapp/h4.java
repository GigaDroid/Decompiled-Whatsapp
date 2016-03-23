package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.util.bq;

class h4 implements OnClickListener {
    final DeleteAccount a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(arj.Theme_switchStyle);
        bq.a(new m5(this.a, this.a, true, true, ""), new String[0]);
    }

    h4(DeleteAccount deleteAccount) {
        this.a = deleteAccount;
    }
}
