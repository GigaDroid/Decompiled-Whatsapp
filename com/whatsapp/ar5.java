package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.VoipActivity.ReplyWithMessageDialogFragment;

class ar5 implements OnClickListener {
    final VoipActivity a;

    public void onClick(View view) {
        if (VoipActivity.c(this.a)) {
            new ReplyWithMessageDialogFragment().show(this.a.getSupportFragmentManager(), null);
        }
    }

    ar5(VoipActivity voipActivity) {
        this.a = voipActivity;
    }
}
