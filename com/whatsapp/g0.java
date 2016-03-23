package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import de.greenrobot.event.h;

class g0 extends Handler {
    public g0(@NonNull Looper looper) {
        super((Looper) auv.a((Object) looper));
    }

    public void handleMessage(Message message) {
        if (!((ana) h.b().b(ana.class)).a) {
            App.a_();
        }
    }
}
