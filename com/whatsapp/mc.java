package com.whatsapp;

import android.view.View;

class mc implements Runnable {
    final Conversation a;
    final String b;

    mc(Conversation conversation, String str) {
        this.a = conversation;
        this.b = str;
    }

    public void run() {
        boolean z = DialogToastActivity.f;
        int i = 0;
        while (i < this.a.bc.getChildCount()) {
            View childAt = this.a.bc.getChildAt(i);
            if (childAt instanceof ConversationRow) {
                ((ConversationRow) childAt).a(this.b);
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
