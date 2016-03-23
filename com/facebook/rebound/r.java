package com.facebook.rebound;

import android.os.SystemClock;

class r implements Runnable {
    final i a;

    public void run() {
        if (i.a(this.a) && this.a.a != null) {
            this.a.a.b((double) (SystemClock.uptimeMillis() - i.c(this.a)));
            i.b(this.a).post(i.d(this.a));
        }
    }

    r(i iVar) {
        this.a = iVar;
    }
}
