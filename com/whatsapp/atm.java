package com.whatsapp;

import android.text.method.TextKeyListener;
import android.view.View;
import android.view.View.OnClickListener;

class atm implements OnClickListener {
    final aij a;

    atm(aij com_whatsapp_aij) {
        this.a = com_whatsapp_aij;
    }

    public void onClick(View view) {
        aij.a(this.a, false);
        aij.a(this.a, null);
        aij.d(this.a).removeDialog(50);
        TextKeyListener.clear(aij.f(this.a).getText());
        this.a.dismiss();
    }
}
