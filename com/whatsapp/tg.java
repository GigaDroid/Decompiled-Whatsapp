package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class tg implements OnClickListener {
    final OverlayAlert a;

    tg(OverlayAlert overlayAlert) {
        this.a = overlayAlert;
    }

    public void onClick(View view) {
        this.a.finish();
    }
}
