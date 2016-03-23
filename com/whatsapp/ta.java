package com.whatsapp;

import android.os.SystemClock;

final class ta {
    public final String a;
    public final boolean b;
    private final long c;
    public final aqs d;

    public long b() {
        if (this.c >= 0) {
            return SystemClock.elapsedRealtime() - this.c;
        }
        return 0;
    }

    public ta(aqs com_whatsapp_aqs, String str, boolean z, long j) {
        this.d = com_whatsapp_aqs;
        this.a = str;
        this.b = z;
        this.c = j;
    }

    public ta(aqs com_whatsapp_aqs) {
        this(com_whatsapp_aqs, null, false, -1);
    }

    public boolean a() {
        return this.d == aqs.SUCCESS;
    }

    public String toString() {
        return this.d.toString();
    }
}
