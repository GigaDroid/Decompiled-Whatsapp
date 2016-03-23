package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class avb implements OnClickListener {
    final aqx a;

    avb(aqx com_whatsapp_aqx) {
        this.a = com_whatsapp_aqx;
    }

    public void onClick(View view) {
        Conversation.e(this.a.a, true);
    }
}
