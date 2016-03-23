package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class k8 extends Handler {
    final RegisterName a;

    k8(RegisterName registerName, Looper looper) {
        this.a = registerName;
        super(looper);
    }

    public void handleMessage(Message message) {
        RegisterName.d(this.a);
    }
}
