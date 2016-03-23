package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class a3q implements OnClickListener {
    final EULA a;

    a3q(EULA eula) {
        this.a = eula;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(6);
        if (ve.C()) {
            this.a.showDialog(8);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        EULA.a(this.a, jf.AGREE_NONE);
    }
}
