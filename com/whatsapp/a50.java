package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class a50 implements OnClickListener {
    final Main a;

    a50(Main main) {
        this.a = main;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        auc.f();
        this.a.removeDialog(0);
        Main.c(this.a);
    }
}
