package com.whatsapp;

import android.view.View;
import com.whatsapp.protocol.co;

class a3o implements Runnable {
    final StarredMessagesActivity a;
    final co b;

    public void run() {
        View findViewWithTag = this.a.a().findViewWithTag(this.b);
        if (findViewWithTag != null) {
            ((ConversationRow) findViewWithTag).l();
        }
    }

    a3o(StarredMessagesActivity starredMessagesActivity, co coVar) {
        this.a = starredMessagesActivity;
        this.b = coVar;
    }
}
