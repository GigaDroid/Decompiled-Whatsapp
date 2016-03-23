package com.whatsapp.messaging;

import android.view.View;
import android.view.View.OnClickListener;

class l implements OnClickListener {
    final CaptivePortalActivity a;

    public void onClick(View view) {
        this.a.finish();
    }

    l(CaptivePortalActivity captivePortalActivity) {
        this.a = captivePortalActivity;
    }
}
