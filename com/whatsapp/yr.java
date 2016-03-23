package com.whatsapp;

import android.view.View;
import com.whatsapp.util.ap;

class yr extends ap {
    final ConversationRowLocation b;

    yr(ConversationRowLocation conversationRowLocation, ao3 com_whatsapp_ao3) {
        this(conversationRowLocation);
    }

    public void a(View view) {
        App.a(this.b.getContext(), this.b.e);
    }

    private yr(ConversationRowLocation conversationRowLocation) {
        this.b = conversationRowLocation;
    }
}
