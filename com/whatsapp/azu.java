package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class azu extends Handler {
    public void handleMessage(Message message) {
        App.g.stop();
    }

    azu(Looper looper) {
        super(looper);
    }
}
