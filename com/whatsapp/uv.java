package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import com.whatsapp.notification.ao;
import de.greenrobot.event.h;

class uv extends Handler {
    final Conversation a;

    public uv(@NonNull Conversation conversation, Looper looper) {
        this.a = conversation;
        super((Looper) auv.a((Object) looper));
    }

    public void handleMessage(Message message) {
        if (!((ana) h.b().b(ana.class)).a) {
            App.a(false, false);
            if (Conversation.a(this.a)) {
                ao.c().a();
            }
            Conversation.b(this.a, false);
            Conversation.k(this.a, true);
        }
    }
}
