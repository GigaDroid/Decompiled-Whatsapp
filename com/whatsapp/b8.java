package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class b8 implements OnClickListener {
    final Conversation a;

    b8(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(View view) {
        Conversation.k(this.a).dismiss();
        if (App.as.a(this.a.aI.p, air.ALLOW)) {
            Conversation.af(this.a);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        App.a(this.a.aI, this.a);
    }
}
