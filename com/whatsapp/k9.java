package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class k9 implements OnClickListener {
    final VoipActivity a;

    public void onClick(View view) {
        if (VoipActivity.e(this.a) != null) {
            VoipActivity.e(this.a).n();
        }
    }

    k9(VoipActivity voipActivity) {
        this.a = voipActivity;
    }
}
