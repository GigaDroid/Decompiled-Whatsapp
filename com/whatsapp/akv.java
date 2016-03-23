package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.util.bq;

class akv implements OnClickListener {
    final ChangeNumber a;

    akv(ChangeNumber changeNumber) {
        this.a = changeNumber;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(arj.Theme_switchStyle);
        bq.a(new m5(this.a, this.a, true, true, ""), new String[0]);
    }
}
