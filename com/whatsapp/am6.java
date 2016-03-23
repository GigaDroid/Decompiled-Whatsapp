package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class am6 implements OnClickListener {
    final aqq a;

    am6(aqq com_whatsapp_aqq) {
        this.a = com_whatsapp_aqq;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        aqq.b(this.a).removeDialog(arj.Theme_seekBarStyle);
        if (this.a.b(true)) {
            this.a.b();
        }
    }
}
