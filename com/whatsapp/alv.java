package com.whatsapp;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;

class alv implements OnPreDrawListener {
    final View a;
    final aqz b;

    alv(aqz com_whatsapp_aqz, View view) {
        this.b = com_whatsapp_aqz;
        this.a = view;
    }

    public boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.a.post(new vy(this));
        return true;
    }
}
