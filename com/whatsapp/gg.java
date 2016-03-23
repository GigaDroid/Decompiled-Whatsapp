package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class gg implements OnClickListener {
    final SystemStatusActivity a;

    gg(SystemStatusActivity systemStatusActivity) {
        this.a = systemStatusActivity;
    }

    public void onClick(View view) {
        this.a.finish();
    }
}
