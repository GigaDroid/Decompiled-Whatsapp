package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class p7 implements OnClickListener {
    final ConversationRow a;

    p7(ConversationRow conversationRow) {
        this.a = conversationRow;
    }

    public void onClick(View view) {
        this.a.e();
    }
}
