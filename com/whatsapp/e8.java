package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class e8 implements OnCancelListener {
    final aij a;

    public void onCancel(DialogInterface dialogInterface) {
        aij.a(this.a, false);
        aij.a(this.a, null);
        aij.d(this.a).removeDialog(50);
    }

    e8(aij com_whatsapp_aij) {
        this.a = com_whatsapp_aij;
    }
}
