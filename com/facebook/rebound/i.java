package com.facebook.rebound;

import android.os.Handler;
import android.os.SystemClock;

class i extends g {
    private boolean c;
    private long d;
    private final Runnable e;
    private final Handler f;

    static long c(i iVar) {
        return iVar.d;
    }

    public i(Handler handler) {
        this.f = handler;
        this.e = new r(this);
    }

    public static g a() {
        return new i(new Handler());
    }

    static boolean a(i iVar) {
        return iVar.c;
    }

    static Runnable d(i iVar) {
        return iVar.e;
    }

    public void m86a() {
        if (!this.c) {
            this.c = true;
            this.d = SystemClock.uptimeMillis();
            this.f.removeCallbacks(this.e);
            this.f.post(this.e);
        }
    }

    static Handler b(i iVar) {
        return iVar.f;
    }

    public void b() {
        this.c = false;
        this.f.removeCallbacks(this.e);
    }
}
