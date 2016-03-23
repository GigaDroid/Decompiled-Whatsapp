package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class av5 implements OnClickListener {
    final DeleteAccount a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(arj.Theme_switchStyle);
    }

    av5(DeleteAccount deleteAccount) {
        this.a = deleteAccount;
    }
}
