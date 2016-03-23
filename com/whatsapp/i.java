package com.whatsapp;

import android.view.View;

class i implements Runnable {
    final Conversation a;

    i(Conversation conversation) {
        this.a = conversation;
    }

    public void run() {
        boolean z = DialogToastActivity.f;
        int i = 0;
        while (i < this.a.bc.getChildCount()) {
            View childAt = this.a.bc.getChildAt(i);
            if (childAt instanceof ConversationRow) {
                ((ConversationRow) childAt).l();
            }
            int i2 = i + 1;
            if (!z) {
                i = i2;
            } else {
                return;
            }
        }
    }
}
