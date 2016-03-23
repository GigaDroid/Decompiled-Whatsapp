package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class x7 extends Handler {
    final Conversation a;

    public void handleMessage(Message message) {
        if (message.what == 1) {
            Conversation.Y(this.a);
        }
        this.a.bc.setTranscriptMode(0);
    }

    x7(Conversation conversation, Looper looper) {
        this.a = conversation;
        super(looper);
    }
}
