package com.facebook.rebound;

import android.annotation.TargetApi;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;

@TargetApi(16)
class h extends g {
    private boolean c;
    private final Choreographer d;
    private long e;
    private final FrameCallback f;

    public static h a() {
        return new h(Choreographer.getInstance());
    }

    public void b() {
        this.c = false;
        this.d.removeFrameCallback(this.f);
    }

    static Choreographer c(h hVar) {
        return hVar.d;
    }

    public void m85a() {
        if (!this.c) {
            this.c = true;
            this.e = SystemClock.uptimeMillis();
            this.d.removeFrameCallback(this.f);
            this.d.postFrameCallback(this.f);
        }
    }

    static FrameCallback d(h hVar) {
        return hVar.f;
    }

    static long a(h hVar) {
        return hVar.e;
    }

    public h(Choreographer choreographer) {
        this.d = choreographer;
        this.f = new n(this);
    }

    static boolean b(h hVar) {
        return hVar.c;
    }

    static long a(h hVar, long j) {
        hVar.e = j;
        return j;
    }
}
