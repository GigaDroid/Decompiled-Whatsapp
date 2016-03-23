package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class qw extends Handler {
    final aol a;

    public void handleMessage(Message message) {
        if (aol.h(this.a) != null) {
            aol.h(this.a).a();
            sendEmptyMessageDelayed(0, (long) aol.f());
        }
    }

    qw(aol com_whatsapp_aol, Looper looper) {
        this.a = com_whatsapp_aol;
        super(looper);
    }
}
