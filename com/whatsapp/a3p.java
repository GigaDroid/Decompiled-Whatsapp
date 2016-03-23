package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class a3p extends Handler {
    final i8 a;

    public void handleMessage(Message message) {
        if (i8.f(this.a) != null) {
            if (i8.f(this.a).f()) {
                i8.a(this.a, this.a.a());
                sendEmptyMessageDelayed(0, 50);
            } else if (!i8.g(this.a)) {
                this.a.v();
            }
        }
    }

    a3p(i8 i8Var, Looper looper) {
        this.a = i8Var;
        super(looper);
    }
}
