package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class cs implements OnClickListener {
    final aqq a;
    final int b;

    public void onClick(DialogInterface dialogInterface, int i) {
        aqq.b(this.a).removeDialog(this.b);
        aqq.b(this.a).showDialog(arj.Theme_ratingBarStyle);
    }

    cs(aqq com_whatsapp_aqq, int i) {
        this.a = com_whatsapp_aqq;
        this.b = i;
    }
}
