package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class avw implements OnClickListener {
    final aqq a;

    public void onClick(DialogInterface dialogInterface, int i) {
        aqq.b(this.a).removeDialog(arj.Theme_checkedTextViewStyle);
        aqq.b(this.a).showDialog(arj.Theme_ratingBarStyle);
    }

    avw(aqq com_whatsapp_aqq) {
        this.a = com_whatsapp_aqq;
    }
}
