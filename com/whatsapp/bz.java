package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class bz implements OnClickListener {
    final VoipNotAllowedActivity a;

    bz(VoipNotAllowedActivity voipNotAllowedActivity) {
        this.a = voipNotAllowedActivity;
    }

    public void onClick(View view) {
        this.a.finish();
    }
}
