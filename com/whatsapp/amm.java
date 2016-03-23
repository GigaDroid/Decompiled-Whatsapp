package com.whatsapp;

import android.os.SystemClock;

public final class amm {
    public static int b;
    private final long a;

    public amm(long j) {
        this.a = j;
    }

    public amm() {
        this(System.currentTimeMillis() - SystemClock.elapsedRealtime());
    }

    public long a() {
        return SystemClock.elapsedRealtime() + this.a;
    }
}
