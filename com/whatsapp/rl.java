package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class rl extends Handler {
    final Conversation a;

    public void handleMessage(Message message) {
        if (message.what == 0) {
            Conversation.ah(this.a);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        Conversation.q(this.a);
    }

    rl(Conversation conversation, Looper looper) {
        this.a = conversation;
        super(looper);
    }
}
