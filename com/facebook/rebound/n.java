package com.facebook.rebound;

import android.os.SystemClock;
import android.view.Choreographer.FrameCallback;

class n implements FrameCallback {
    final h a;

    public void doFrame(long j) {
        if (h.b(this.a) && this.a.a != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.a.a.b((double) (uptimeMillis - h.a(this.a)));
            h.a(this.a, uptimeMillis);
            h.c(this.a).postFrameCallback(h.d(this.a));
        }
    }

    n(h hVar) {
        this.a = hVar;
    }
}
