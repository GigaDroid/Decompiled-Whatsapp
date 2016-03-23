package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class aqy implements OnClickListener {
    final VoipActivity a;

    aqy(VoipActivity voipActivity) {
        this.a = voipActivity;
    }

    public void onClick(View view) {
        String peerJid = Voip.getPeerJid();
        if (peerJid != null) {
            this.a.startActivity(Conversation.a(App.as.b(peerJid)));
        }
    }
}
