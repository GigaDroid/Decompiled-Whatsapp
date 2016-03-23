package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class nl implements OnClickListener {
    final RegisterName a;

    nl(RegisterName registerName) {
        this.a = registerName;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        RegisterName.j(this.a);
        this.a.removeDialog(1);
    }
}
