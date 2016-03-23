package com.whatsapp;

import android.os.SystemClock;

public class vz {
    private final int a;
    private final int b;
    private final int c;

    public boolean c(int i) {
        return b(a(i));
    }

    private static boolean b(int i) {
        return SystemClock.elapsedRealtime() % ((long) i) == 0;
    }

    public vz(int i, int i2, int i3) {
        this.c = i;
        this.a = i2;
        this.b = i3;
    }

    public int a(int i) {
        if (App.am == 3) {
            return 1;
        }
        if (App.am == 2) {
            return this.c * i;
        }
        if (App.am == 1 || App.j == 1) {
            return this.a * i;
        }
        return this.b * i;
    }

    public boolean a() {
        return c(1);
    }
}
