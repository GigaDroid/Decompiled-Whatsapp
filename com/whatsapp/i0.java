package com.whatsapp;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;

class i0 implements OnPreDrawListener {
    final View a;
    final ContactInfo b;

    i0(ContactInfo contactInfo, View view) {
        this.b = contactInfo;
        this.a = view;
    }

    public boolean onPreDraw() {
        ContactInfo.e(this.b).d();
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
