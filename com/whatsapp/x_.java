package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class x_ implements OnClickListener {
    final VoipActivity a;

    public void onClick(View view) {
        if (VoipActivity.e(this.a) != null) {
            VoipActivity.e(this.a).k();
        }
    }

    x_(VoipActivity voipActivity) {
        this.a = voipActivity;
    }
}
