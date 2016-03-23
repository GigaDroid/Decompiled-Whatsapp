package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class au0 implements OnClickListener {
    final ai0 a;
    final View b;
    final View c;

    public void onClick(View view) {
        this.c.startAnimation(new ub(this.a, this.c, this.b));
    }

    au0(ai0 com_whatsapp_ai0, View view, View view2) {
        this.a = com_whatsapp_ai0;
        this.c = view;
        this.b = view2;
    }
}
