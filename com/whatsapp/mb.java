package com.whatsapp;

import android.support.annotation.NonNull;
import java.io.File;

public class mb {
    private File a;
    private File b;
    private int c;
    private long d;
    private long e;

    static File a(mb mbVar) {
        return mbVar.a;
    }

    static long c(mb mbVar) {
        return mbVar.d;
    }

    public mn a() {
        return new mn(this, null);
    }

    public mb b(long j) {
        this.d = j;
        return this;
    }

    public mb a(int i) {
        this.c = i;
        return this;
    }

    public mb a(long j) {
        this.e = j;
        return this;
    }

    static File b(mb mbVar) {
        return mbVar.b;
    }

    static int e(mb mbVar) {
        return mbVar.c;
    }

    public mb(@NonNull File file, @NonNull File file2) {
        this.c = 96000;
        this.a = file;
        this.b = file2;
    }

    static long d(mb mbVar) {
        return mbVar.e;
    }
}
