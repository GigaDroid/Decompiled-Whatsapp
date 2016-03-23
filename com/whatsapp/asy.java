package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class asy implements OnClickListener {
    final ChangeNumber a;

    asy(ChangeNumber changeNumber) {
        this.a = changeNumber;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(arj.Theme_switchStyle);
    }
}
