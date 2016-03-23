package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class hc implements OnClickListener {
    final SetStatus a;

    hc(SetStatus setStatus) {
        this.a = setStatus;
    }

    public void onClick(View view) {
        this.a.showDialog(50);
    }
}
