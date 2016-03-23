package com.whatsapp;

import android.view.View;
import com.whatsapp.util.ap;

class y1 extends ap {
    final ConversationRowMedia b;

    y1(ConversationRowMedia conversationRowMedia) {
        this.b = conversationRowMedia;
    }

    public void a(View view) {
        App.a(this.b.e, true);
    }
}
