package com.whatsapp.util;

public final class StatResult {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final int e;
    public final int f;

    public static native StatResult statOpenFile(int i);

    private StatResult(int i, int i2, int i3, int i4, long j, long j2) {
        this.f = i;
        this.b = i2;
        this.e = i3;
        this.a = i4;
        this.c = j;
        this.d = j2;
    }
}
