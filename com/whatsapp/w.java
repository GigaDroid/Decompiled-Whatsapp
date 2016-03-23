package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class w implements OnClickListener {
    final aqx a;

    w(aqx com_whatsapp_aqx) {
        this.a = com_whatsapp_aqx;
    }

    public void onClick(View view) {
        Conversation.e(this.a.a, false);
    }
}
