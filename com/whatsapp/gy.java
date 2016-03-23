package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class gy implements OnClickListener {
    final ConversationRow a;

    gy(ConversationRow conversationRow) {
        this.a = conversationRow;
    }

    public void onClick(View view) {
        if (this.a.isLongClickable()) {
            b2 k = this.a.k();
            if (k != null) {
                ConversationRow.b(this.a).setSelected(k.c(this.a.e));
            }
        }
    }
}
