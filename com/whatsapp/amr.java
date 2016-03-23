package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class amr implements OnClickListener {
    final VoipActivity a;

    amr(VoipActivity voipActivity) {
        this.a = voipActivity;
    }

    public void onClick(View view) {
        if (VoipActivity.e(this.a) != null) {
            VoipActivity.e(this.a).f();
        }
    }
}
